package lesson11;

public class App {
    public static void main(String[] args) {

        Address annaAddress = new Address("12 Elm st", "Gothem city", "33547", State.FL);
        Person anna = new Person("Anna","Wilson", 1995, annaAddress);

        String street = anna.getAddress().getAddress1();
        System.out.println(street);

        Address davidAddress = new Address("35 Sun street","Sun city","44531", State.CA);
        Person david = new Person("David", "Peterson",1998,davidAddress);

        Team south = new Team(anna,david);

        String city = south.getPlayer().getAddress().getCity();
        System.out.println(city);

        System.out.println(annaAddress);
        System.out.println(anna);
        System.out.println(south.getPlayer());
    }
}
