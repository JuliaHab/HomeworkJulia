package hwselenium2;

public class Herbivores implements Mammals{
    String nameHerbivores;
    int age;

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
