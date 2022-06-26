package hwselenium2;

public class Whales implements Mammals{
    String nameWhales;
    int age;

    @Override
    public void canEat() {
        System.out.println(nameWhales + " eat plancton.");
    }

    @Override
    public void Age() {
        System.out.println(nameWhales + " " + age);
    }

    @Override
    public void canHumans() {
        System.out.println(nameWhales + " swim well.");
    }

    @Override
    public void haveSkeleton() {
        System.out.println(nameWhales + " huge skeleton.");
    }
}
