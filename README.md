#### Домашнее задание к занятию 1.2 Работа с синхронизацией. Synchronized блоки. Методы wait, notify, sleep. Интерфейс lock
#### Задача 2. Продвинутый автосалон


```text
"C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\jbr\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\lib\idea_rt.jar=51934:C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\User\IdeaProjects\ThreadAdvancesAutoShop\target\classes;C:\Users\User\.m2\repository\org\apache\httpcomponents\httpclient\4.5.12\httpclient-4.5.12.jar;C:\Users\User\.m2\repository\org\apache\httpcomponents\httpcore\4.4.13\httpcore-4.4.13.jar;C:\Users\User\.m2\repository\commons-logging\commons-logging\1.2\commons-logging-1.2.jar;C:\Users\User\.m2\repository\commons-codec\commons-codec\1.11\commons-codec-1.11.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.12.1\jackson-databind-2.12.1.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.12.1\jackson-annotations-2.12.1.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.12.1\jackson-core-2.12.1.jar;C:\Users\User\.m2\repository\org\hamcrest\hamcrest-all\1.3\hamcrest-all-1.3.jar ru.idcore.Main
Производитель произвел автомобиль и отправил в автосалон...
Продавец начал обрабатывать запрос от Покупатель-2 на продажу автомашины...
Ответ для - Покупатель-2: Машин в продаже нет. Ожидайте!
Продавец начал обрабатывать запрос от Покупатель-0 на продажу автомашины...
Ответ для - Покупатель-0: Машин в продаже нет. Ожидайте!
Продавец начал обрабатывать запрос от Покупатель-3 на продажу автомашины...
Ответ для - Покупатель-3: Машин в продаже нет. Ожидайте!
Продавец начал обрабатывать запрос от Покупатель-1 на продажу автомашины...
Ответ для - Покупатель-1: Машин в продаже нет. Ожидайте!
Продавец начал обрабатывать запрос от Покупатель-4 на продажу автомашины...
Ответ для - Покупатель-4: Машин в продаже нет. Ожидайте!
Продавец начал приемку автомашины...
Продавец завершил приемку автомашины...
Машина продана. Покупатель-2 получил автомашину...
Ответ для - Покупатель-0: Машин в продаже нет. Ожидайте!
Ответ для - Покупатель-3: Машин в продаже нет. Ожидайте!
Ответ для - Покупатель-1: Машин в продаже нет. Ожидайте!
Ответ для - Покупатель-4: Машин в продаже нет. Ожидайте!
Производитель произвел автомобиль и отправил в автосалон...
Продавец начал приемку автомашины...
Продавец завершил приемку автомашины...
Машина продана. Покупатель-0 получил автомашину...
Ответ для - Покупатель-3: Машин в продаже нет. Ожидайте!
Ответ для - Покупатель-1: Машин в продаже нет. Ожидайте!
Ответ для - Покупатель-4: Машин в продаже нет. Ожидайте!
Производитель произвел автомобиль и отправил в автосалон...
Продавец начал приемку автомашины...
Продавец завершил приемку автомашины...
Машина продана. Покупатель-3 получил автомашину...
Ответ для - Покупатель-1: Машин в продаже нет. Ожидайте!
Ответ для - Покупатель-4: Машин в продаже нет. Ожидайте!
Производитель произвел автомобиль и отправил в автосалон...
Продавец начал приемку автомашины...
Продавец завершил приемку автомашины...
Машина продана. Покупатель-1 получил автомашину...
Ответ для - Покупатель-4: Машин в продаже нет. Ожидайте!
Производитель произвел автомобиль и отправил в автосалон...
Продавец начал приемку автомашины...
Продавец завершил приемку автомашины...
Машина продана. Покупатель-4 получил автомашину...

Process finished with exit code 0
```