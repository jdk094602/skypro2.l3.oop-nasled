
import transport.Car;

import java.util.Arrays;

import static transport.Car.changeTires;
/*
7. Домашнее задание
7 из 7
Задание 1
Создайте класс
Transport
, который содержит в себе следующие параметры:
«Марка»,
«Модель»,
«Год выпуска»,
«Страна производства»,
«Цвет кузова»,
«Максимальная скорость передвижения».
Создайте геттеры и сеттеры для необходимых полей. Параметры «Год выпуска», «Страна производства» не могут изменяться. Параметры «Цвет» и «Скорость» изменяться могут.
Для изменяемых параметров добавьте проверку данных: значение должно быть указано корректно, не должно содержать
null
 и не может быть пустым.

Скорректируйте класс
Car
 таким образом, чтобы ранее указанные параметры не повторяли те, которые содержатся в классе
Transport
.
Класс
Car
 должен наследовать параметры класса
Transport
.
Критерии проверки
Создан класс
Transport
 с параметрами.
Класс
Car
 должен быть наследником класса
Transport
.
Для класса
Car
 настроено расширение.
Параметры класса
Car
 скорректированы, убраны повторы параметров из класса
Transport
.
Данные по ранее созданным объектам выведены в консоль.


Задание 2
Создайте новый класс «Автобус» (
Bus
), который полностью наследует все параметры класса
Transport
.
Создайте любые 3 объекта для данного класса, по каждому выведите в консоль данные.
Критерии проверки
Создан класс
Bus
.
Класс Bus расширяет класс
Transport
.
Создано 3 произвольных объекта.
Информация о каждом объекте выведена в консоль.
* */
public class Main {
    public static void main(String[] args) {
        Car[] car = new Car[7];         /// массив для объекто класса Car
//        Car.Key[] key = new Car.Key[7];  /// массив для объекто класса Car.Key - если бы класс Key был статическим

        car[0] = new Car("Lada","Granta",1.7F,"желтый",2015,"Россия",
                "manual", "sedan", "RTY1357908642", "5 человек+3 багажа", true, 180
//                , new Car.Key(true , true)  // если бы класс Key был статическим можно создавать его объекты прямо в конструкторе внешн. класса
        );
        // если класс Key  НЕстатический - создаём его ВНЕ конструктора внешн.класса, т.к. сначала нужно создать объект внешн.класса , здесь - car[0]
        // создаём объект класса Key в объекте класса Car
        car[0].key = car[0].new Key(true,  false);

        System.out.println(car[0]);
        System.out.println(car[0].key);

        car[1] = new Car("Audi","A8 50 L TDI quattro",3F,"чёрный",2020,"Германия",
                "manual", "wagon", "RFV1354645642", "5 человек+3 багажа", true, 240
                );

        // создаём объект класса Key в объекте класса Car
        car[1].key = car[1].new Key(true, true);

        System.out.println(car[1]);
        System.out.println(car[1].key);

        car[2] = new Car("BMW","Z8",3F,"чёрный",2021,"Германия" ,
        "automatic", "cabriolet", "WSX4564654542", "2 человек+2 багажа", true, 288
                );
        car[3] = new Car("KIA","Sportage",2.4F,"красный",2018,"Южная Корея" ,
        "manual", "hatchback", "POI2349808642", "5 человек+3 багажа", true, 200
                );
        car[4] = new Car("Hyundai","Avante",1.6F,"оранжевый",2016,"Южная Корея",
        "automatic", "sedan", "FDY1357908665", "", true, 180
                );
        car[5] = new Car("Hewlett Packard","ColorJet",0,"",1998,"США"  ,
        "", "desktop", "FGDFGFDGFD642", "", false, 0
                );
        car[6] = new Car("Epson","FX - 900 ",0,"",1999,"",
        "", "standalone", "R-----3242342", "", false, 3
                );

        System.out.println(Arrays.toString(car));

        // поменяем резину

        changeTires(2, car[6] );

        System.out.println("Сменили резину в " + car[6].getBrand() + " " + car[6].getModel() );
        System.out.println(car[6]);
    }
}