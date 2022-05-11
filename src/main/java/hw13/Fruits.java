package hw13;

import java.util.ArrayList;
import java.util.List;

public class Fruits {
    public static void main(String[] args) {

        List<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banan");
        fruit.add("Orange");
        fruit.add("Pear");

        // add
        fruit.add(2,"Grape");
        fruit.add(4,"Cherry");
        System.out.println(fruit);

        // remove
        fruit.remove("Grape");
        System.out.println(fruit);

        // get
        System.out.println(fruit.get(0));

        // contains
        System.out.println(fruit.contains("Cherry"));
        System.out.println(fruit.contains("Grape"));

        // foreach
        for (String k: fruit){
            System.out.println(k);
        }

        // for
        for (int m=0; m<fruit.size(); m++){
            System.out.println(fruit.get(m));
        }

        // size
        System.out.println(fruit.size());

    }
}
