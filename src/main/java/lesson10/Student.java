package lesson10;

// child класс, использует атрибуты родительского класса
public class Student extends Person {

    private String major;

    public Student (String name, String lastname, int year, String major) {
        super (name, lastname, year);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
