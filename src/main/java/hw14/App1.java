package hw14;

import java.util.HashSet;
import java.util.Set;

public class App1 {
    public static void main(String[] args) {

        Set<String> makeCar = new HashSet<>();
        makeCar.add("Volvo");
        makeCar.add("BMW");
        makeCar.add("Ford");
        makeCar.add("Mercedes");
        System.out.println(makeCar);

        // add
        makeCar.add("Audi");
        makeCar.add("BMW");
        System.out.println(makeCar);

        // replace сделать нельзя, contains
        System.out.println(makeCar.contains("Volvo"));
        System.out.println(makeCar.contains("Hyundai"));

        // remove
        makeCar.remove("Ford");
        System.out.println(makeCar);

        // get нельзя сделать

        // foreach
        for (String car: makeCar){
            System.out.println(car);
        }


        Rivers volga = new Rivers("Volga");
        Rivers mississippi = new Rivers("Mississippi");

        Set<Rivers> river = new HashSet<>();
        river.add(new Rivers("Amazon"));
        river.add(new Rivers("Nile"));
        river.add(volga);
        river.add(mississippi);
        System.out.println(river.toString());

        // add
        river.add(new Rivers("Yenisei"));
        System.out.println(river.toString());

        // replace сделать нельзя, contains
        System.out.println(river.contains("Nile"));
        System.out.println(river.contains("Elena"));

        // remove
        river.remove(volga);
        System.out.println(river.toString());

        // get нельзя сделать

        // foreach
        for (Rivers i: river){
            System.out.println(i);
        }

    }

}
