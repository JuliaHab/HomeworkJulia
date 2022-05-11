package hw10;

// child класс по отношению к AirTransport, а также внук по отношению к Transport (т.е. может пользоваться атрибутами и методами этого класса)
public class Plane extends AirTransport {

    public Plane(String model, String color, int weight, int speed, int flightAltitude, String manufacturer) {
        super(model, color, weight, speed, flightAltitude, manufacturer);
    }
}
