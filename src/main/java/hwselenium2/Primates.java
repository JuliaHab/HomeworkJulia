package hwselenium2;

public class Primates implements Mammals{
    String types;
    String namePrimates;
    int age;

    @Override
    public void canEat() {
        System.out.println(namePrimates + "loved banana.");
    }

    @Override
    public void Age() {
        System.out.println(namePrimates + " " + age);
    }

    @Override
    public void canHumans() {
        System.out.println("I have " + types + " big wool.");
    }

    @Override
    public void haveSkeleton() {
        System.out.println(types + " have long fingers");
    }
}
