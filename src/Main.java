
import transport.Car;

import java.util.Arrays;

import static transport.Car.changeTires;

public class Main {
    public static void main(String[] args) {
        Car[] car = new Car[7];         /// массив для объекто класса Car
//        Car.Key[] key = new Car.Key[7];  /// массив для объекто класса Car.Key - если бы класс Key был статическим

        car[0] = new Car("Lada","Granta",1.7F,"желтый",2015,"Россия",
                "manual", "sedan", "RTY1357908642", "5 человек+3 багажа", true
//                , new Car.Key(true , true)  // если бы класс Key был статическим можно создавать его объекты прямо в конструкторе внешн. класса
        );
        // если класс Key  НЕстатический - создаём его ВНЕ конструктора внешн.класса, т.к. сначала нужно создать объект внешн.класса , здесь - car[0]
        // создаём объект класса Key в объекте класса Car
        car[0].key = car[0].new Key(true,  false);

        System.out.println(car[0]);
        System.out.println(car[0].key);

        car[1] = new Car("Audi","A8 50 L TDI quattro",3F,"чёрный",2020,"Германия",
                "manual", "wagon", "RFV1354645642", "5 человек+3 багажа", true
                );

        // создаём объект класса Key в объекте класса Car
        car[1].key = car[1].new Key(true, true);

        System.out.println(car[1]);
        System.out.println(car[1].key);

        car[2] = new Car("BMW","Z8",3F,"чёрный",2021,"Германия" ,
        "automatic", "cabriolet", "WSX4564654542", "2 человек+2 багажа", true
                );
        car[3] = new Car("KIA","Sportage",2.4F,"красный",2018,"Южная Корея" ,
        "manual", "hatchback", "POI2349808642", "5 человек+3 багажа", true
                );
        car[4] = new Car("Hyundai","Avante",1.6F,"оранжевый",2016,"Южная Корея",
        "automatic", "sedan", "FDY1357908665", "", true
                );
        car[5] = new Car("Hewlett Packard","ColorJet",0,"",1998,"США"  ,
        "", "desktop", "FGDFGFDGFD642", "", false
                );
        car[6] = new Car("Epson","FX - 900 ",0,"",1999,"",
        "", "standalone", "R-----3242342", "", false
                );

        System.out.println(Arrays.toString(car));

//        car[6].changeTyres(6);
//        почему то при использовании НЕстатического метода получаю ошибку.
//        java: cannot find symbol
//        symbol:   method changeTyres(int)
//                location: class transport.Car
        // поменяем резину

        changeTires(2, car[6] );

        System.out.println("Сменили резину в " + car[6].getBrand() + " " + car[6].getModel() );
        System.out.println(car[6]);

    }
}