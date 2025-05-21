// Parent class
class Hospital {
    void treatPatient() {
        System.out.println("Hospital is treating a patient.");
    }
}

// Child class 1 (inherits from Hospital)
class GeneralHospital extends Hospital {
    void provideGeneralCare() {
        System.out.println("Providing general care for the patient.");
    }
}

// Child class 2 (inherits from Hospital)
class SpecialHospital extends Hospital {
    void specialCare() {
        System.out.println("Special care is being provided for the patient.");
    }
}

// Main class with the main() method
public class HospitalInheritance {
    public static void main(String[] args) {
        GeneralHospital general = new GeneralHospital();
        SpecialHospital care = new SpecialHospital();

        general.treatPatient(); // Inherited from Hospital
        general.provideGeneralCare(); // Specific to GeneralHospital

        care.treatPatient(); // Inherited from Hospital
        care.specialCare(); // Specific to SpecialHospital
    }
}
