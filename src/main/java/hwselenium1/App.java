package hwselenium1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Address addressFarm = new Address("21 Sunny street","San Luis Obispo","CA",93405);

        Map<Cattle,Integer> cattleFarm = new HashMap<>();
        cattleFarm.put(Cattle.CHICKENS,15);
        cattleFarm.put(Cattle.COWS,3);
        cattleFarm.put(Cattle.HOUSES,1);
        cattleFarm.put(Cattle.PIGS,5);
        cattleFarm.put(Cattle.GOATS,4);
        cattleFarm.put(Cattle.SHEEP,2);

        AgrerCultural corn = new AgrerCultural("Corns",5);
        AgrerCultural potatoes = new AgrerCultural("Potatoes",3);
        AgrerCultural tomatoes = new AgrerCultural("Tomatoes",1);
        AgrerCultural cucumbers = new AgrerCultural("Cucumbers",1);
        AgrerCultural onions = new AgrerCultural("Onions",1);
        AgrerCultural sunflower = new AgrerCultural("Sunflower",3);
        AgrerCultural pumpkin = new AgrerCultural("Pumpkin",2);
        List<AgrerCultural> culturalsFarm = new ArrayList<>();
        culturalsFarm.add(corn);
        culturalsFarm.add(potatoes);
        culturalsFarm.add(tomatoes);
        culturalsFarm.add(cucumbers);
        culturalsFarm.add(onions);
        culturalsFarm.add(sunflower);
        culturalsFarm.add(pumpkin);

        Farm myFarm = new Farm("Funny farm",addressFarm,cattleFarm,culturalsFarm);

        myFarm.printInfo();

    }
}
