package hw9;

public class Cosmetic {

    private String product;
    private String farm;
    private int volume;

    public Cosmetic(){}

    public Cosmetic (String farm, String product, int volume){
        this.farm = farm;
        this.product = product;
        this.volume = volume;
    }

    public void setProduct(String product){
        this.product = product;
    }
    public String getProduct(){
        return this.product;
    }

    public void setFarm(String farm){
        this.farm = farm;
    }
    public String getFarm(){
        return this.farm;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }
    public int getVolume(){
        return this.volume;
    }

    // method
    public void sellProduct(){
        System.out.println("I am looking for a "+farm+" brand "+product+" with a volume of "+volume+" ml");
    }


}
