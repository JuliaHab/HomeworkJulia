package hwselenium2;

public class Lion extends Carnivores{
    private String nameLion;

    public Lion(String nameCarnivores, String lifeIn, int age, String nameLion) {
        super(nameCarnivores, lifeIn, age);
        this.nameLion = nameLion;
    }

    public String getNameLion() {
        return nameLion;
    }

    public void setNameLion(String nameLion) {
        this.nameLion = nameLion;
    }
}
