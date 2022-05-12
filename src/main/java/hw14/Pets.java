package hw14;

public class Pets {
    private String nike;

    public Pets(String nike) {
        this.nike = nike;
    }

    public String getNike() {
        return nike;
    }

    public void setNike(String nike) {
        this.nike = nike;
    }

    @Override
    public String toString() {
        return nike;
    }
}
