package transport;

public class Bus extends Transport{
    public Bus(String brand, String model, String color, String country, int maxSpeed) {
        super(brand, model, color, country, maxSpeed);
    }

    @Override
    public String toString() {
        return "Автобус " +
                getBrand() + ' ' + getModel() +
                ", цвет '" + getColor() + '\'' +
                ", MAX скорость '" + getMaxSpeed() + '\'' +
                ", страна производства - '" + getCountry() + '\'' + "\n"
                ;
    }

}

