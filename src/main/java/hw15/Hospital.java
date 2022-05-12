package hw15;

import java.util.List;
import java.util.Map;

public class Hospital {

    private final String hospitalName;
    private final Address address;
    private final List<Doctor> doctors;
    private final Map<Integer,String> rooms;
    private final List<InsuranseCompanies> acceptedInsuranses;

    public Hospital(String hospitalName, Address address, List<Doctor> doctors, Map<Integer, String> rooms, List<InsuranseCompanies> acceptedInsuranses) {
        this.hospitalName = hospitalName;
        this.address = address;
        this.doctors = doctors;
        this.rooms = rooms;
        this.acceptedInsuranses = acceptedInsuranses;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public Address getAddress() {
        return address;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public Map<Integer, String> getRooms() {
        return rooms;
    }


    public List<InsuranseCompanies> getAcceptedInsuranses() {
        return acceptedInsuranses;
    }

    public void printDoctors(){
        System.out.println(getDoctors());
    }

    public void printRoom(){
        System.out.println(rooms.entrySet());
    }

        @Override
    public String toString() {
        return "Hospital: name - "+hospitalName+"\nAddress: "+address+"\nDoctors:"+doctors+"\nRooms: "+rooms+"\nAccepted insuranses: "+acceptedInsuranses;
    }

}
