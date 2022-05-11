package hw12;

public class Dogs implements ActionAnimal{
    private String nike;
    private double weight;
    private int age;

    public Dogs(String nikeName, double weight, int age) {
        this.nike = nikeName;
        this.weight = weight;
        this.age = age;
    }

    public String getNikeName() {
        return nike;
    }
    public void setNikeName(String nikeName) {
        this.nike = nikeName;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void getAnimal() {
        System.out.println("This is Dog!");
    }

    @Override
    public void getName() {
        System.out.println("I named my dog "+nike+". It weighs "+weight+" kg.");
    }

    @Override
    public void getVoice() {
        System.out.println("Gav-Gav");
    }

    @Override
    public int HumanAge() {
        return age*7;
    }
}
