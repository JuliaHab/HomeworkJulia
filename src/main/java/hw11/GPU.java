package hw11;

public class GPU {
    private GPUmake gpUmake;
    private int memorysize;
    private String make;
    private String model;

    public GPU(GPUmake gpUmake, int memorysize, String make, String model) {
        this.gpUmake = gpUmake;
        this.memorysize = memorysize;
        this.make = make;
        this.model = model;
    }

    public GPUmake getGpUmake() {
        return gpUmake;
    }

    public void setGpUmake(GPUmake gpUmake) {
        this.gpUmake = gpUmake;
    }

    public int getMemorysize() {
        return memorysize;
    }

    public void setMemorysize(int memorysize) {
        this.memorysize = memorysize;
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
        return "GPU: GPUmake - "+gpUmake+", memorysize - "+memorysize+"Mb, make - "+make+", model - "+model;
    }
}
