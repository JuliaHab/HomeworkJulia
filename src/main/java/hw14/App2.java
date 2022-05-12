package hw14;

import java.util.HashMap;
import java.util.Map;

public class App2 {
    public static void main(String[] args) {

        Map<String, String> family = new HashMap<>();
        family.put("Father", "Jimmy Smith");
        family.put("Mother", "Jenny Smith");
        family.put("First Child","Mark Smith");
        family.put("Second Child", "Anna Smith");
        System.out.println(family);

        // put
        family.put("Grandma", "Sophia Williams");
        family.put("Best Friend", "Billy Null");
        System.out.println(family);

        // replace
        family.put("Second Child", "Rebeka Smith");
        System.out.println(family);

        // remove
        family.remove("Best Friend");
        System.out.println(family);

        // get
        System.out.println(family.get("Mother"));
        System.out.println(family.get("Father"));

        // foreach
        for (String member: family.keySet()){
            System.out.println(member);
        }

        for (String namesFamily: family.values()){
            System.out.println(namesFamily);
        }

        for (Map.Entry<String,String> myFamily: family.entrySet()){
            System.out.println(myFamily);
        }


        Map<Double, String> time = new HashMap<>();
        time.put(7.00, "Wake up");
        time.put(18.00, "Dinner");
        time.put(8.00, "Breakfast");
        time.put(12.00, "Walk");
        System.out.println(time);

        // put
        time.put(22.00, "Sleep");
        time.put(18.40, "Run");
        System.out.println(time);

        // replace
        time.put(12.00, "Lunch");
        System.out.println(time);

        // remove
        time.remove(18.40);
        System.out.println(time);

        // get
        System.out.println(time.keySet());
        System.out.println(time.values());

        // foreach

        for (Double times: time.keySet()){
            System.out.println(times);
        }

        for (String action: time.values()){
            System.out.println(action);
        }

        for (Map.Entry<Double,String> schedule: time.entrySet()){
            System.out.println(schedule);
        }

        Pets dog = new Pets("Ruby");
        Pets cat = new Pets("Chloe");
        PetOwner jane = new PetOwner("Jane","Brown");
        PetOwner peter = new PetOwner("Peter", "Parker");

        Map<Pets, PetOwner> owner = new HashMap<>();
        owner.put(dog,peter);
        owner.put(cat,jane);
        owner.put(new Pets("Kitty"),new PetOwner("Julian","Walker"));
        System.out.println(owner);

        // put
        owner.put(new Pets("Hamster"), new PetOwner("Billy","Strong"));
        System.out.println(owner);

        // replace
        owner.put(cat,peter);
        System.out.println(owner);

        // remove
        owner.remove(cat);
        System.out.println(owner);

        // get
        System.out.println(owner.keySet());
        System.out.println(owner.values());

        // foreach

        for (Pets pet: owner.keySet()){
            System.out.println(pet);
        }

        for (PetOwner owners: owner.values()){
            System.out.println(owners);
        }

        for (Map.Entry<Pets,PetOwner> x: owner.entrySet()){
            System.out.println(x);
        }

    }
}
