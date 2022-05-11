package lesson15;

public class App {
    public static void main(String[] args) {
        Person anna = new Person("Anna");
        Person david = new Person("David");
        Person steve = new Person("Steve");

        System.out.println(anna.getNonStaticCount());
        System.out.println(steve.getNonStaticCount());

        System.out.println(anna.getCount());  // показывает общее количество объектов, потому что привязана ко всему классу через static

        Person.hello("David"); // вызывается только через класс, не получится данный метод вызвать через объект (anna.hello - не работает)

    }
}
