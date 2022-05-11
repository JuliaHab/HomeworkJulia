package hw10;

public class App {
    public static void main(String[] args) {

        Plane airbus = new Plane("Air-563","Green", 1500, 650,12000, "Airbus S.A.S.");
        Plane boeing = new Plane("BO-340","Violet",2300,560,11500,"Boeing");

        Helicopter number1 = new Helicopter("Mig-657","Haki",860, 540,6000,"Supercopter",300);

        System.out.println("Info: "+airbus.getModel()+" "+airbus.getManufacturer()+" "+airbus.getColor()+" "+airbus.getSpeed()+" "+airbus.getFlightAltitude()+" "+airbus.getWeight());
        System.out.println("Info: "+boeing.getModel()+" "+boeing.getManufacturer()+" "+boeing.getColor()+" "+boeing.getSpeed()+" "+boeing.getFlightAltitude()+" "+boeing.getWeight());

        System.out.println("Info: "+number1.getModel()+" "+number1.getManufacturer()+" "+number1.getColor()+" "+number1.getSpeed()+" "+number1.getFlightAltitude()+" "+number1.getWeight()+" "+number1.getTankCapacity());
    }
}
