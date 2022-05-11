package lesson15;

public class Person {

    private String name;
    private static int count;
    private int nonStaticCount;

    public Person(String name) {
        this.name = name;
        count++;
        nonStaticCount++;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public static void hello(String name){
        System.out.println("Hello, "+name);   // из статических функций нельзя вызвать нестатическое поле

       // но можем вызвать статическое поле (count)
        System.out.println("Population = "+count);
    }

    }
