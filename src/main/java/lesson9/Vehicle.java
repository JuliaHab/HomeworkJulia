package lesson9;

public class Vehicle {

    // Атрибуты, параметры, филды (поля)
    private String make;
    private String model;
    private int years;
    private Colors color;

    // Конструктор (полный)
    public Vehicle (String make, String model, int years, Colors color) {
        this.make = make;
        this.model = model;
        this.color = color;
        setYears(years); // или this.years = years
    }

    // Конструктор (пустой)
    public Vehicle(){}

    // Конструктор (частичный)
    public Vehicle (String model, String make, int  years){
        this.model = model;
        this.make = make;
        setYears(years);  // или this.years = years
    }

    // Использования меотодв сеттер и геттер для переменной colors
    public void setColors (Colors color){
        this.color = color;
    }

    public Colors getColor(){
        return this.color;    // тут обязательно указываем this, т.к. мы использовали color в методе и конструкторах
    }

    // Использования меотодв сеттер и геттер для переменной make
    public void setMake (String make){
        this.make = make;
    }

    public String getMake (){
        return this.make;
    }

    // Использования меотодв сеттер и геттер для переменной model
    public void setModel (String m){
        model = m;
    }

    public String getModel(){
        return model;
    }

    // Использования меотодв сеттер и геттер для переменной years
    public void setYears (int years){
        if (years>2022 || years<2001){
            throw new IllegalArgumentException("Wrong years");
        }
        this.years = years;
    }

    public int getYears (){
        return this.years;
    }
}
