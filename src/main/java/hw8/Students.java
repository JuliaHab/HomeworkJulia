package hw8;

public class Students {
    public String name;
    public String lastname;
    public int age;
    public double gradepoint;
    public String facultet;

    public void info(){
        System.out.println("INFO:"+"\nName - "+name+"\nLastname - "+lastname+"\nAge - "+age+"\nGrade point - "+gradepoint+"\nFaculty - "+facultet);
    }

    public void Hi(String name, String lastname){
        System.out.println("Hello, my name "+this.name+" "+this.lastname+". I'm a student. \nI'm study on facultet "+facultet+"\nToday i will meetihg with a new student "+name+" "+lastname);
    }
}
