package hwselenium2;

public class Whales implements Mammals{
    private String nameWhales;
    private int age;

    public Whales(String nameWhales, int age) {
        this.nameWhales = nameWhales;
        this.age = age;
    }

    public String getNameWhales() {
        return nameWhales;
    }

    public void setNameWhales(String nameWhales) {
        this.nameWhales = nameWhales;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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
