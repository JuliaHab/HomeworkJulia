package lesson10;

// является child классом Teacher, но при этом Teacher является child классом Person
public class SubstituteTeacher extends Teacher {
    private String schedule;

    public SubstituteTeacher(String name, String lastname, int year, String subject, String schedule) {
        super(name, lastname, year, subject);
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
}
