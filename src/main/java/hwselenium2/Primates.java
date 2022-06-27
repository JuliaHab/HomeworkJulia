package hwselenium2;

public class Primates implements Mammals{
    private String types;
    private String namePrimates;
    private int age;

    public Primates(String types, String namePrimates, int age) {
        this.types = types;
        this.namePrimates = namePrimates;
        this.age = age;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getNamePrimates() {
        return namePrimates;
    }

    public void setNamePrimates(String namePrimates) {
        this.namePrimates = namePrimates;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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
