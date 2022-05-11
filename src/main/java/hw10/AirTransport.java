package hw10;

// child класс по отношению к классу Transport и родительский класс по отношению к Helicopter и Plane
public class AirTransport extends Transport {
    protected int flightAltitude;
    protected String manufacturer;

    public AirTransport(String model, String color, int weight, int speed, int flightAltitude, String manufacturer) {
        super(model, color, weight, speed);
        this.flightAltitude = flightAltitude;
        this.manufacturer = manufacturer;
    }

    public int getFlightAltitude() {
        return flightAltitude;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
