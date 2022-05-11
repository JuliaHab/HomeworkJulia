package lesson14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App2 {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("China", "Beijing");               // эоементы добавляются через put
        capitals.put("India", "New Delhi");
        capitals.put("New Zealand", "Wellington");
        capitals.put("Canada", "Ottawa");
        capitals.put("Madagaskar", "Antananarivu");

        System.out.println(capitals);
        // map обязательно состоит из ключа (первое String) и значения (второе String)

        // добавляем элементы
        capitals.put("England", "London");
        capitals.put("UK", "London");      // ключ уникалный и не повторяется, значение повторятся может

        System.out.println(capitals);

        // при одинаковом ключе заменяет ранее заданный элемент
        capitals.put("China", "Pekin");

        System.out.println(capitals);


        // пример 2
        Map<Integer, String> colors = new HashMap<>();
        colors.put(0,"Red");
        colors.put(1,"Green");
        colors.put(2,"Red");
        colors.put(3,"Green");
        colors.put(123,"Red");

        System.out.println(colors.get(0));
        System.out.println(colors);

        // выводим все элементы ключа
        Set<String> keys = capitals.keySet();
        for (String country: keys){
            System.out.println(country);
        }

        // спопоб 2 - выводим все элементы ключа
        for (String country: capitals.keySet()){
            System.out.println(country);
        }

        // выводим все элементы значения (города)
        Collection<String> cities = capitals.values();
        for (String city: cities){
            System.out.println(city);
        }

        // спопоб 2 - выводим все элементы значения (города)
        for (String city: capitals.values()){
            System.out.println(city);
        }

        // выводим пару "ключ-значение"
        for (Map.Entry<String,String> pair: capitals.entrySet()){
            System.out.println(pair.getKey()+" "+pair.getValue());
        }
    }
}
