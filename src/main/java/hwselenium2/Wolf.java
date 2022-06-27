package hwselenium2;

public class Wolf extends Carnivores{
    private String nameWolf;

    public Wolf(String nameCarnivores, String lifeIn, int age, String nameWolf) {
        super(nameCarnivores, lifeIn, age);
        this.nameWolf = nameWolf;
    }

    public String getNameWolf() {
        return nameWolf;
    }

    public void setNameWolf(String nameWolf) {
        this.nameWolf = nameWolf;
    }
}
