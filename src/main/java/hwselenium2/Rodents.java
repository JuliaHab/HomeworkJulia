package hwselenium2;

public class Rodents implements Mammals{
    String nameRodents;
    int age;

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
