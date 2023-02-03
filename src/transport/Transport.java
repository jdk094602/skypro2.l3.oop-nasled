package transport;

public class Transport {
    private final String brand;
    private final String model;
    private String color;
    private String country;     // страна сборки
    private int maxSpeed;     // максимальная скорость


    public Transport(String brand, String model, String color, String country, int maxSpeed

    ) {
        this.brand = brand;
        this.model = model;
        this.setColor(color);
        this.setCountry(country);
        this.setMaxSpeed(maxSpeed);
        //        this.key = key;  // если бы класс Key был статическим

    }

    private static String fillString(String checkString, String defaultString) {
        return checkString == null || checkString == "" || checkString.isBlank() ? defaultString : checkString;
    }

    public String getBrand() {
        return fillString (brand,"default");
    }

    public String getModel() {
        return fillString (model,"default");
    }

    public String getColor() {
        return fillString (color,"белый");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed <=0 || maxSpeed >= 400 ? 200 : maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) { this.maxSpeed = maxSpeed; }

    public String getCountry() {
        return fillString (country,"default");
    }

    public void setCountry(String country) {
        this.country = country ;
    }

    @Override
    public String toString() {
        return "Транспортное средство " +
                getBrand() + ' ' + getModel() +
                ", цвет '" + getColor() + '\'' +
                ", MAX скорость '" + getMaxSpeed() + '\'' +
                ", страна производства - '" + getCountry() + '\'' + "\n"
        ;
    }
}

