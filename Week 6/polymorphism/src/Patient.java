import java.util.ArrayList;
class Patient{
    String name;
    int age;
    String disease;
    int roomnumber;

    public Patient(String name,int age,String disease,int roomnumber){
        this.name=name;
        this.age=age;
        this.disease=disease;
        this.roomnumber=roomnumber;
    }
    public void displayinfo(){
        System.out.println("Name:"+name+", Age:"+age+", disease:"+disease+", roomno: "+roomnumber);
    }
}