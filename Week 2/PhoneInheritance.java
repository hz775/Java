class Phone {
    void call() {
        System.out.println("Making a call...");
    }

    void message() {
        System.out.println("Sending a message...");
    }
}

class Smartphone extends Phone {
    void browseInternet() {
        System.out.println("Browsing the internet...");
    }
}

class iPhone extends Smartphone {
    void useFaceID() {
        System.out.println("Unlocking iPhone using Face ID...");
    }
}


class AndroidPhone extends Smartphone {
    void useGoogleAssistant() {
        System.out.println("Using Google Assistant...");
    }
}

public class PhoneInheritance {
    public static void main(String[] args) {
        iPhone myiPhone = new iPhone();
        AndroidPhone myAndroid = new AndroidPhone();

        System.out.println("iPhone features:");
        myiPhone.call();          
        myiPhone.message();       
        myiPhone.browseInternet();
        myiPhone.useFaceID();     

        System.out.println("\nAndroid Phone features:");
        myAndroid.call();             
        myAndroid.message();         
        myAndroid.browseInternet();   
        myAndroid.useGoogleAssistant(); 
    }
}
