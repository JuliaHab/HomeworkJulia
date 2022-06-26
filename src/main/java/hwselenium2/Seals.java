package hwselenium2;

public class Seals implements Mammals{
    String nameSeals;
    int age;

    @Override
    public void canEat() {
        System.out.println(nameSeals + " eat fish yesterday.");
    }

    @Override
    public void Age() {
        System.out.println(nameSeals + " " + age + " immortal");
    }

    @Override
    public void canHumans() {
        System.out.println("I love sun.");
    }

    @Override
    public void haveSkeleton() {
        System.out.println("I have fins");
    }
}
