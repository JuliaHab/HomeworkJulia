package lesson13;

public class App {
    public static void main(String[] args) {

        // примитивная (primitive) переменная0 (при новом значении а, переменная b не изменит своего первичного значения)
        int a = 12;
        int b = a;
        a = 123;

        System.out.println("b = "+b);

        // ссылочная (reference) переменная (при новом значении а1, переменная b1 изменит свое первичное значение)
        Person a1 = new Person("Anna");
        Person b1 = a1;
        a1.setName("Jane");

        System.out.println("b1 = "+b1.getName());
        System.out.println(a1==b1); // сравнил два объекта, они идеинтичны т.к. из условия выше b1 = a1 - ответ true

        Person c1 = new Person("Jane");

        System.out.println(a1==c1); // имена одинаковые, но это два разных объекта - ответ false
        System.out.println(a1.equals(c1)); // сравнили два имени в объектах (через слово equals стравниваются String) - ответ true



    }
}
