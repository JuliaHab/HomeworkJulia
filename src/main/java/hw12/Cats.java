package hw12;

public class Cats implements ActionAnimal{
    private String nike;
    private String color;
    private int year;

    public Cats(String name, String color, int year) {
        this.nike = name;
        this.color = color;
        this.year = year;
    }

    public void setName(String name) {
        this.nike = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void getAnimal() {
        System.out.println("This is cat!");
    }

    @Override
    public void getName() {
        System.out.println("I named my "+color+" cat "+nike+".");
    }

    @Override
    public void getVoice() {
        System.out.println("May-May");
    }

    @Override
    public int HumanAge() {
        return (2022-year)*7;
    }
}
