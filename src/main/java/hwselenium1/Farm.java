package hwselenium1;

import java.util.List;
import java.util.Map;

public class Farm {

    private String name;
    private Address address;
    private Map<Cattle, Integer> cattle;
    private List<AgrerCultural> agrerCultural;

    public Farm(String name, Address address, Map<Cattle, Integer> cattle, List<AgrerCultural> agrerCultural) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agrerCultural = agrerCultural;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Map<Cattle, Integer> getCattle() {
        return cattle;
    }

    public void setCattle(Map<Cattle, Integer> cattle) {
        this.cattle = cattle;
    }

    public List<AgrerCultural> getAgrerCultural() {
        return agrerCultural;
    }

    public void setAgrerCultural(List<AgrerCultural> agrerCultural) {
        this.agrerCultural = agrerCultural;
    }

    public void printInfo(){
        System.out.println(name+":\nAddress: "+address+"\nCattle: "+cattle+"\nAgrer Cultural: "+agrerCultural);
    }

}
