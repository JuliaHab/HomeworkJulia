package hw10;

// родительский или super класс
public class Transport {
    protected String model;
    protected String color;
    protected int weight;
    protected int speed;

    public Transport(String model, String color, int weight, int speed) {
        this.model = model;
        this.color = color;
        this.weight = weight;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }
}
