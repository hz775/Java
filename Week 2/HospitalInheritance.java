class Hospital {
	
	
    void treatPatient() {
        System.out.println("Hospital is treating a patient.");
    }
}

class GeneralHospital extends Hospital {
    void provideGeneralCare() {
        System.out.println("Providing general care for the patient.");
    }
}

class SpecialHospital extends Hospital {
    void specialCare() {
        System.out.println("Special care is being provided for the patient.");
    }
}

public class HospitalInheritance {
    public static void main(String[] args) {
        GeneralHospital general = new GeneralHospital();
        SpecialHospital care = new SpecialHospital();

        general.treatPatient(); 
        general.provideGeneralCare(); 

        care.treatPatient(); 
        care.specialCare(); 
    }
}
