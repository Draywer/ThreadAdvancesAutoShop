package ru.idcore;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Seller {

    private AutoShop autoShop;
    private ReentrantLock lock;
    private Condition condition;

    public Seller(AutoShop autoShop) {
        this.autoShop = autoShop;
        lock = new ReentrantLock(true);
        condition = lock.newCondition();
    }

    public AutoShop getAutoShop() {
        return autoShop;
    }

    public void setAutoShop(AutoShop autoShop) {
        this.autoShop = autoShop;
    }

    public void sellAuto() {
        lock.lock();
        try {

            System.out.printf("Продавец начал обрабатывать запрос от %s на продажу автомашины...\n", Thread.currentThread().getName());
            while (autoShop.getAutos().size() == 0) {
                System.out.printf("Ответ для - %s: Машин в продаже нет. Ожидайте!\n", Thread.currentThread().getName());
                condition.await();
            }
            Thread.sleep(autoShop.getTimeForSelling());
            autoShop.getAutos().pollFirst();
            System.out.printf("Машина продана. %s получил автомашину...\n", Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }


    public void receiveAuto() {
        lock.lock();
        try {

            System.out.println("Продавец начал приемку автомашины...");
            Thread.sleep(autoShop.getTimeReceive());
            if (autoShop.getAutos().offer(new Auto())) {
                System.out.println("Продавец завершил приемку автомашины...");
                condition.signalAll();
            } else {
                System.out.println("Продавеци не принял автомашину...");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
