package lesson13;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(45);

        Person anna = new Person("Anna");
        Person david = new Person("David");

        List<Person> staff = new ArrayList<>();
        staff.add(anna);
        staff.add(david);
        staff.add(new Person("David"));
        staff.add(new Person("Steve"));

        System.out.println(staff.get(3).getName());

    }
}
