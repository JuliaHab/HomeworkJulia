package hwselenium2;

public class Herbivores implements Mammals{
    private String nameHerbivores;
    private int age;

    public Herbivores(String nameHerbivores, int age) {
        this.nameHerbivores = nameHerbivores;
        this.age = age;
    }

    public String getNameHerbivores() {
        return nameHerbivores;
    }

    public int getAge() {
        return age;
    }

    public void setNameHerbivores(String nameHerbivores) {
        this.nameHerbivores = nameHerbivores;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void canEat() {
        System.out.println(nameHerbivores + " eat grass.");
    }

    @Override
    public void Age() {
        System.out.println(nameHerbivores + " " + age);
    }

    @Override
    public void canHumans() {
        System.out.println(nameHerbivores + " running from the guard");
    }

    @Override
    public void haveSkeleton() {
        System.out.println(nameHerbivores + " skeleton vary big.");
    }
}
