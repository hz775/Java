class Hospital {
    void treatPatient() {
        System.out.println("Hospital is treating a patient.");
    }
}

class GeneralHospital extends Hospital {
    @Override
    void treatPatient() {
        System.out.println("General Hospital is treating a patient with basic care.");
    }
}

class SpecialHospital extends Hospital {
    @Override
    void treatPatient() {
        System.out.println("Special Hospital is treating a patient with advanced care.");
    }
}

public class HospitalPolymorphism {
    public static void main(String[] args) {
        // Parent class reference, child class objects (runtime polymorphism)
        Hospital hospital1 = new GeneralHospital();
        Hospital hospital2 = new SpecialHospital();

        // Calling overridden methods
        hospital1.treatPatient(); 
        hospital2.treatPatient(); 
    }
}
