package hwselenium1;

public class AgrerCultural {
    private String nameOfCulture;
    private int fieldNumber;

    public AgrerCultural(String nameOfCulture, int fieldNumber) {
        this.nameOfCulture = nameOfCulture;
        this.fieldNumber = fieldNumber;
    }

    public String getNameOfCulture() {
        return nameOfCulture;
    }

    public void setNameOfCulture(String nameOfCulture) {
        this.nameOfCulture = nameOfCulture;
    }

    public int getFielsNumber() {
        return fieldNumber;
    }

    public void setFielsNumber(int fielsNumber) {
        this.fieldNumber = fielsNumber;
    }

    @Override
    public String toString() {
        return nameOfCulture+": "+fieldNumber+" files";
    }
}
