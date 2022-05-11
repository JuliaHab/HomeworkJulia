package hw13;

import java.util.ArrayList;
import java.util.List;

public class Kitchen {
    public static void main(String[] args) {

        Dishes plate = new Dishes("Plate");
        Dishes glass = new Dishes("Glass");

        List<Dishes> dishe = new ArrayList<>();
        dishe.add(plate);
        dishe.add(glass);
        dishe.add(new Dishes("Mug"));
        dishe.add(new Dishes("Spoon"));

        // size
        System.out.println(dishe.size());

        // add
        dishe.add(2,new Dishes("Saucer"));
        Dishes fork = new Dishes("Fork");
        dishe.add(4,fork);
        System.out.println(dishe.toString());

        // remove
        dishe.remove(0); // не ншла как удалить объект
        System.out.println(dishe.toString());

        // get
        System.out.println(dishe.get(4));

        // contains
        System.out.println(dishe.contains("Plate"));
        System.out.println(dishe.contains("Spoon"));

        // for
        for (int o=0; o<dishe.size(); o++){
            System.out.println(dishe.get(o));
        }

        // foreach
        for (Dishes y: dishe){
            System.out.println(y);
        }
    }
}
