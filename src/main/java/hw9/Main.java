package hw9;

public class Main {
    public static void main(String[] args) {

        // класс Shirt
        Shirt forMe = new Shirt("Violet","L",2.5);

        Shirt forFriend = new Shirt();
        forFriend.setColors("Green");
        forFriend.setSize("M");
        forFriend.setPrice(3.45);

        forMe.action("Julia");
        System.out.println("I buy for my friend "+forFriend.getColors()+" shirt "+forFriend.getSize()+" size for "+forFriend.getPrice()+"$.");

        // класс ROK
        ROK tapok = new ROK();
        tapok.setServer(2354);
        tapok.setName("Tupik");
        tapok.setPower(74000000);
        tapok.setPlayer("Tapok");

        ROK turumuru = new ROK(2354, "Tupik", 69000000, "Turumuru");

        tapok.doing();
        System.out.println("Info: \n"+turumuru.getPlayer()+"\n"+turumuru.getPower()+"\n"+turumuru.getName()+"\n"+turumuru.getServer());

        // класс Dogs
        Dogs puppy = new Dogs("Pompon", 3,"brown");

        Dogs fluffy = new Dogs();
        fluffy.setAge(1);
        fluffy.setColoring("goldy");
        fluffy.setNikename("Flu-Flu");

        puppy.BuyDog("Maxim");
        System.out.println("I have dog: nike "+fluffy.getNikename()+", age "+ fluffy.getAge()+", coloring "+fluffy.getColoring()+".");

        // класс Cosmetic
        Cosmetic toner = new Cosmetic();
        toner.setProduct("Toner");
        toner.setFarm("NEOGEN");
        toner.setVolume(800);

        Cosmetic serum = new Cosmetic("Cosrx","Serum",350);

        serum.sellProduct();
        System.out.println("Product: "+toner.getFarm()+" "+toner.getProduct()+" "+toner.getVolume()+" ml.");
    }
}
