package hwselenium2;

public class Carnivores implements Mammals{
    String nameCarnivores;
    String lifeIn;
    int age;

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
