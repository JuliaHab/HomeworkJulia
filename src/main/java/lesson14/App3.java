package lesson14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App3 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Green");

        Iterator<String> iterator = colors.iterator();

        while (iterator.hasNext()){  // hasNext спрашивает ест ли следующий элемент
            System.out.println(iterator.next()); // печатает и переходит на следующий шаг
        }
    }
}
