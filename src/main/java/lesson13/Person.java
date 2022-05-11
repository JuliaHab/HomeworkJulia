package lesson13;

import java.util.Objects;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Person p1) {           // этот метод сравнивет значения двух объектов (совпадают ли имена 2 person или нет)
        return this.name.equals(p1.getName());
    }

}
