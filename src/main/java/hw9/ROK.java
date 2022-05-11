package hw9;

public class ROK {

    private int server;
    private String name;
    private int power;
    private String player;

    public void doing(){
        System.out.println("I am playing on "+name+" "+server+". My player "+player+" power "+power);
    }

    public ROK (int server, String name, int power, String player){
        this.server = server;
        this.name = name;
        this.power = power;
        this.player = player;
    }

    public ROK(){}

    public void setServer(int ser){
        server = ser;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPower(int power){
        this.power = power;
        }
    public void setPlayer(String player){
        this.player = player;
    }

    public String getName(){
        return this.name;
    }
    public int getServer(){
        return server;
    }
    public String getPlayer(){
        return this.player;
    }
    public int getPower(){
        return this.power;
    }

}
