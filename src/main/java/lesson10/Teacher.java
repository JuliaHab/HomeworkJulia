package lesson10;

// child класс, использует атрибуты родительского класса
public class Teacher extends Person {

    private String subject;

    public Teacher(String name, String lastname, int year, String subject) {
        super(name, lastname, year);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
