package lesson14;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Green");
        System.out.println(colors);
        // выводит элементы в произвольном порядке, т.к. в set отсутствуют индексы (поэтому у Set отсутствуют геттеры - нет возможности достать информацию без индекса)

        colors.add("Red");
        System.out.println(colors); // в set только уникальные значения, поэтому повторно "Red" он не выводит

        System.out.println(colors.contains("Red"));
        System.out.println(colors.contains("Violet"));

        for (String i: colors){
            System.out.println(i);
        }
    }
}
