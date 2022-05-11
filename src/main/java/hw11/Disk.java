package hw11;

public class Disk {
    private int size;
    private DiskType type;
    private String make;
    private String model;

    public Disk(int size, DiskType type, String make, String model) {
        this.size = size;
        this.type = type;
        this.make = make;
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public DiskType getType() {
        return type;
    }

    public void setType(DiskType type) {
        this.type = type;
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
        return "Disk: size - "+size+"Gb, type - "+type+", make - "+make+ ", model - "+model;
    }
}
