package lesson9;

public class Example {
    public static void main(String[] args) {

        Vehicle myCar = new Vehicle("Ford", "Fusion", 2005, Colors.BLUE);

        Vehicle thisCar = new Vehicle();

        thisCar.setMake("BMW");
        thisCar.setModel("Argus");
        thisCar.setColors(Colors.GREEN);
        thisCar.setYears(2012);

        Vehicle herCar = new Vehicle("Focus", "Ford", 2015);

        System.out.println(myCar.getMake()+" "+myCar.getModel()+" "+myCar.getYears()+" "+myCar.getColor());
        System.out.println(thisCar.getColor()+" "+thisCar.getModel()+" "+thisCar.getMake()+" "+thisCar.getYears());
        System.out.println(herCar.getColor()+"\n"+herCar.getYears()+"\n"+herCar.getModel()+"\n"+herCar.getMake());
        }
    }

