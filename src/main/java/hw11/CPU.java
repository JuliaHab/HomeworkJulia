package hw11;

public class CPU {
    private double frequency;
    private String make;
    private String model;

    public CPU(double frequency, String make, String model) {
        this.frequency = frequency;
        this.make = make;
        this.model = model;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "frequency - "+frequency+"GHz, make - "+make+", model - "+model;
    }
}
