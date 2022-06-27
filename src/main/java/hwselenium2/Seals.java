package hwselenium2;

public class Seals implements Mammals{
    private String nameSeals;
    private int age;

    public Seals(String nameSeals, int age) {
        this.nameSeals = nameSeals;
        this.age = age;
    }

    public String getNameSeals() {
        return nameSeals;
    }

    public void setNameSeals(String nameSeals) {
        this.nameSeals = nameSeals;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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
