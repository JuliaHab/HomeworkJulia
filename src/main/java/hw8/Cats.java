package hw8;

public class Cats {
    public String name;
    public int age;
    public String color;
    public double weight;

    public void Catsleep (){
        System.out.println(name+" sleeping...."+"\nZ-z-z-z-z....");
    }

    public void Catspeak (String name) {
        System.out.println("Hi, my name "+name+". I have cat. \nName cat: "+this.name+"\nAge: "+age+"\nWeight: "+weight+"\nColor: "+color);
    }
}
