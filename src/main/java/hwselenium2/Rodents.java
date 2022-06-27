package hwselenium2;

public class Rodents implements Mammals{
    private String nameRodents;
    private int age;

    public Rodents(String nameRodents, int age) {
        this.nameRodents = nameRodents;
        this.age = age;
    }

    public String getNameRodents() {
        return nameRodents;
    }

    public void setNameRodents(String nameRodents) {
        this.nameRodents = nameRodents;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void canEat() {
        System.out.println(nameRodents + " love nuts");
    }

    @Override
    public void Age() {
        System.out.println(nameRodents + " " + age);
    }

    @Override
    public void canHumans() {
        System.out.println(nameRodents + " live in hole.");
    }

    @Override
    public void haveSkeleton() {
        System.out.println(nameRodents + " very small.");
    }

}
