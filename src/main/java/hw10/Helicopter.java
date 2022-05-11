package hw10;

// child класс по отношению к AirTransport, а также внук по отношению к Transport (т.е. может пользоваться атрибутами и методами этого класса)
public class Helicopter extends AirTransport {
    private int tankCapacity;

    public Helicopter(String model, String color, int weight, int speed, int flightAltitude, String manufacturer, int tankCapacity) {
        super(model, color, weight, speed, flightAltitude, manufacturer);
        this.tankCapacity = tankCapacity;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }
}
