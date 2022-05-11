package hw11;

public class Copmuter {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;
    private SystemBlock systemBlock;
    private String make;
    private String model;

    public Copmuter(Keyboard keyboard, Mouse mouse, Monitor monitor, SystemBlock systemBlock, String make, String model) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
        this.systemBlock = systemBlock;
        this.make = make;
        this.model = model;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public SystemBlock getSystemBlock() {
        return systemBlock;
    }

    public void setSystemBlock(SystemBlock systemBlock) {
        this.systemBlock = systemBlock;
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
        return "Copmuter: "+"\n"+keyboard+"\n"+mouse+"\n"+monitor+"\n"+systemBlock+"\n"+make+"\n" + model;
    }
}
