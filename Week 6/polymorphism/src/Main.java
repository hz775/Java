import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        Patient p1=new Patient("Ravi", 45, "Fever", 101);
        Patient p2 = new Patient("Anita", 30, "Fracture", 102);
        Patient p3 = new Patient("Suresh", 55, "Diabetes", 103);

        ArrayList<Patient> patientList=new ArrayList<>();
        patientList.add(p1);
        patientList.add(p2);
        patientList.add(p3);

        for(Patient patient: patientList){
            patient.displayinfo();
        }
    }
}