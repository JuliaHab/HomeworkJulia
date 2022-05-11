package hw8;

public class App4 {
    public static void main(String[] args) {

        // Students

        Students tom = new Students();
        tom.name = "Tom";
        tom.lastname = "Smith";
        tom.age = 21;
        tom.gradepoint = 85.54;
        tom.facultet = "Math";

        tom.info();
        tom.Hi("June", "Masters");

        Students trish = new Students();
        trish.facultet = "Psyhology";
        trish.age = 24;
        trish.name = "Patrisia";
        trish.gradepoint = 76.5;

        trish.info();
        trish.Hi("Muhamed","");
    }
}
