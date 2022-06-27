package hwselenium2;

public class BlueWhale extends Whales{
    private String nameBlueWhale;

    public BlueWhale(String nameWhales, int age, String nameBlueWhale) {
        super(nameWhales, age);
        this.nameBlueWhale = nameBlueWhale;
    }

    public String getNameBlueWhale() {
        return nameBlueWhale;
    }

    public void setNameBlueWhale(String nameBlueWhale) {
        this.nameBlueWhale = nameBlueWhale;
    }
}
