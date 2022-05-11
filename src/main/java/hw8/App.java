package hw8;

public class App {
    public static void main(String[] args) {

     // Cats

     Cats cat1 = new Cats();
     cat1.name = "Baron";
     cat1.color = "Gray";
     cat1.age = 6;
     cat1.weight = 7.54;

     cat1.Catsleep();
     cat1.Catspeak("Charles");

     Cats cat2 = new Cats();
     cat2.color = "Brown";
     cat2.age = 12;
     cat2.name = "Filip";

     cat2.Catspeak("Anna");
     cat2.Catsleep();


    }
}
