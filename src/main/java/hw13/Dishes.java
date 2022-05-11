package hw13;

public class Dishes {
    private String object;

    public Dishes (String object) {
        this.object = object;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return object;
    }
}
