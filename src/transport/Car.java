package transport;

public class Car extends Transport {
    private float engineVolume; // объем двигателя
    private final int year;           // год выпуска
    private String gearType;    // тип коробки передач
    private String bodyType;    // тип кузова
    private String regNum;     // рег.номер
    private final String capacity; // вместимость
    private boolean winterTyres; // признак типа резины (TRUE - зимняя, FALSE - летняя)

    public Key key;

    public class Key {
        private final boolean isInvoice; // бесключевой доступ ?
        private final boolean isRemoteEngineStart; // удаленный запуск двигателя ?

        public Key(boolean isInvoice, boolean isRemoteEngineStart) {
            this.isInvoice =  isInvoice != true ? false : isInvoice;
            this.isRemoteEngineStart = isRemoteEngineStart != true ? false : isRemoteEngineStart;
        }

        public boolean isInvoice() {
            return isInvoice;
        }

        public boolean isRemoteEngineStart() {
            return isRemoteEngineStart;
        }

        @Override
        public String toString() {
            return "            ключ :" +
                    "Бесключевой доступ =" + isInvoice() +
                    ", Удалённый запуск=" + isRemoteEngineStart() +
                    "\n";
        }

        void KeyIsTurn() {
            System.out.println("Key is turn in ejection ");
        }
    }

    // создадим 2 конструктора, первый - с сокращённым количеством параметров
//    public Car(String brand, String model, float engineVolume, String color, int year, String country,
//               String gearType, String bodyType, String regNum, String capacity, boolean winterTyres
//    ) {
//        this(brand, model, engineVolume, color, year, country, gearType, bodyType, regNum, capacity, winterTyres,
//        false, false);
//    }
    public Car(String brand, String model, float engineVolume, String color, int year, String country,
               String gearType, String bodyType, String regNum, String capacity, boolean winterTyres, int maxSpeed
//               , Key key // если бы класс Key был статическим
//               , boolean isInvoice, boolean isRemoteEngineStart
    ) {
        super(brand, model, color, country, maxSpeed);
        this.setEngineVolume(engineVolume);
        this.year = year;
        this.setGearType(gearType);
        this.bodyType = bodyType;
        this.setRegNum(regNum);
        this.capacity = capacity;
        this.setWinterTyres(winterTyres);
        //        this.key = key;  // если бы класс Key был статическим

    }

    private static String fillString(String checkString, String defaultString) {
        return checkString == null || checkString == "" || checkString.isBlank() ? defaultString : checkString;
    }
//    public void changeTires (int monthNum) {
//        this.setWinterTyres(monthNum >= 4 && monthNum <= 10 ? false : true);
//    }
    public static void changeTires (int monthNum, Car car) {
        car.setWinterTyres(monthNum >= 4 && monthNum <= 10 ? false : true);
    }

    public float getEngineVolume() {
        return engineVolume <= 0 ? 1.5F : engineVolume ;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getYear() {
        return year <=0 ? 2000 : year;
    }

    public String getGearType() {
        return fillString (gearType,"manual");
    }

    public String getBodyType() {
        return fillString (bodyType,"sedan");
    }

    public String getRegNum() {
        return fillString (regNum,"unregistered");
    }

    public String getCapacity() {
        return fillString (capacity,"unknown");
    }

    public boolean isWinterTyres() {
        return winterTyres;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public void setWinterTyres(boolean winterTyres) {
        this.winterTyres = winterTyres;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Автомобиль " +
                getBrand() + ' ' + getModel() +
                ": объём двигателя - " + getEngineVolume() +
                ", цвет '" + getColor() + '\'' +
                ", год выпуска - " + getYear() +
                ", страна производства - '" + getCountry() + '\'' + "\n"
                + "     коробка передач - '" + getGearType() + '\''
                + ", тип кузова - '" + getBodyType() + '\''
                + ", регистрационный № - '" + getRegNum() + '\''
                + ", вместимость - '" + getCapacity() + '\''
                + ", MAX скорость '" + getMaxSpeed() + '\''
                + ", зимняя резина - '" + isWinterTyres() + '\''  + "\n"
//              + this.key.toString()
//                + "            ключ :"
//                + "Бесключевой доступ =" + key.isInvoice()
//              +  ", Удалённый запуск=" + key.isRemoteEngineStart()

        ;
    }
}

