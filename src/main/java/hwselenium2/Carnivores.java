package hwselenium2;

public class Carnivores implements Mammals{
    private String nameCarnivores;
    private String lifeIn;
    private int age;

    public Carnivores(String nameCarnivores, String lifeIn, int age) {
        this.nameCarnivores = nameCarnivores;
        this.lifeIn = lifeIn;
        this.age = age;
    }

    public String getNameCarnivores() {
        return nameCarnivores;
    }

    public String getLifeIn() {
        return lifeIn;
    }

    public int getAge() {
        return age;
    }

    public void setNameCarnivores(String nameCarnivores) {
        this.nameCarnivores = nameCarnivores;
    }

    public void setLifeIn(String lifeIn) {
        this.lifeIn = lifeIn;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void canEat() {
        System.out.println(nameCarnivores + " love meet.");
    }

    @Override
    public void Age() {
        System.out.println("I live "+age);
    }

    @Override
    public void canHumans() {
        System.out.println("I have four paws.");
    }

    @Override
    public void haveSkeleton() {
        System.out.println("I have tail.");
    }
}
