package lesson13;

import java.util.ArrayList;
import java.util.List;

// Arraylist
public class App1 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>(); // пустой массив (слевой части интерфейс, а с правой класс)
        colors.add("Red");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Green");
        colors.add("Yellow");
        System.out.println(colors);
        System.out.println(colors.size()); // показывает размер массива (сколько элементов в массиве)
        System.out.println(colors.get(1)); // достает элемент по идексу

        colors.add(1, "Orange"); // добавляет элемент в массив (сначало нужно указать индекс на которое мы ставим элемент, потом название)
        System.out.println(colors); // после обязательно нужно сделать второй раз sout иначе новый элемент не будет виден

        colors.set(5, "Pink");  // меняет элемент в массиве (сначало нужно указать индекс заменяемого элемента, потом название)
        System.out.println(colors);

        System.out.println(colors.contains("Yellow")); // проверка наличия элемента с таким названием
        System.out.println(colors.contains("Pink"));

        colors.remove("Red"); // удаление элемента массива по названию, удалит только первый попавшийся элемент
        System.out.println(colors);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));  // распечатали весь массив через for
        }

        for (String color : colors) {      // распечатали весь массив через foreach
            System.out.println(color);
        }

        colors.forEach(color -> System.out.println(color));// распечатали весь массив с помощью встроенного метода foreach

        // -> = это анонимная функция лямбда
    }
}
