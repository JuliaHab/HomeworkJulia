package lesson11;

public class Person {
    private String name;
    private String lastname;
    private int year;
    private Address address;

    public Person(String name, String lastname, int year, Address address) {
        this.name = name;
        this.lastname = lastname;
        this.year = year;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastnae(String lastname) {
        this.lastname = lastname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", year=" + year +
                ", address=" + address +
                '}';
    }
}
