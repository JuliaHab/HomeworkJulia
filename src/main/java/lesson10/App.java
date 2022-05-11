package lesson10;

public class App {
    public static void main(String[] args) {
        Person anna = new Person("Anna","Wilson",1995);
        Student david = new Student("David","Peterson",1991,"Math");
        Teacher mrJones = new Teacher("Steve","Jones",1989,"History");

        System.out.println(mrJones.getLastname()+" "+mrJones.getName()+" "+mrJones.getYear()+" "+mrJones.getSubject());
    }
}
