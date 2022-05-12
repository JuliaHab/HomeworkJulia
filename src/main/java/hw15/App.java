package hw15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Address addresHospital = new Address("Ocean Drive","Miami","FL",33408);

        Doctor entDoctor = new Doctor("Filip","Keks",Position.ENT);
        Doctor surgeonDoctor = new Doctor("Mary","Coldwell", Position.SURGEON);
        Doctor oculistDoctor = new Doctor("Steve","Masters",Position.OCULIST);
        Doctor physicianDoctor = new Doctor("Katerina","Filch",Position.PHYSICIAN);
        Doctor pediatricianDoctor = new Doctor("Chloe", "Strang",Position.PEDIATRICIAN);

        List<Doctor> doctors = new ArrayList<>();
        doctors.add(entDoctor);
        doctors.add(surgeonDoctor);
        doctors.add(oculistDoctor);
        doctors.add(pediatricianDoctor);
        doctors.add(physicianDoctor);

        Map<Integer,String> rooms = new HashMap<>();
        rooms.put(215,"Pediatrics");
        rooms.put(305, "Otolaryngology");
        rooms.put(401,"Surgical");
        rooms.put(508,"Psychological");
        rooms.put(111,"Ophthalmology");

        List<InsuranseCompanies> acceptedInsuranses = new ArrayList<>();
        acceptedInsuranses.add(InsuranseCompanies.SOGAZ_MED);
        acceptedInsuranses.add(InsuranseCompanies.INGOSSTRAKH_M);
        acceptedInsuranses.add(InsuranseCompanies.MSK_MEDSTRAKH);

        Hospital myHospital = new Hospital("MedSquare",addresHospital,doctors,rooms,acceptedInsuranses);

        System.out.println(myHospital);

        myHospital.printDoctors();

        myHospital.printRoom();

    }
}
