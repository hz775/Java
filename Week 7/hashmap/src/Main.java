import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();

        map.put("China",120);
        map.put("India",111);
        map.put("Japan",144);
        System.out.println(map);

        if(map.containsKey("Japan")){
            System.out.println("Key value is present");
        }
        else{
            System.out.println("Not Preesnt");
        }
        System.out.println(map.get("China"));
        System.out.println(map.get("India"));

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}