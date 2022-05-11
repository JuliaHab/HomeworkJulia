package hw9;

public class Shirt {

    private String colors;
    private String size;
    private double price;

    public void action (String name) {
        System.out.println(name+" found a "+colors+" shirt "+size+" size for "+price+"$ in the store.");
    }

    public Shirt(String colors, String size, double price){
        this.colors = colors;
        this.size = size;
        this.price = price;
    }

    public Shirt() {}

    public void setColors(String colors){
        this.colors = colors;
    }
    public String getColors(){
        return this.colors;
    }

    public void setSize(String size1){
        size = size1;
    }
    public String getSize(){
        return size;
    }

    public void setPrice(double p){
        price = p;
    }
    public double getPrice(){
        return price;
    }
}
