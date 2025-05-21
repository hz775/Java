import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Map<String,Integer> Quantity=new HashMap<>();
        Quantity.put("Mango",100);
        Quantity.put("Nuts",1);
        Quantity.put("Banana",200);
        Quantity.put("Goa",10);

        System.out.println("Quantiy:");
        System.out.println(Quantity);
        Quantity.remove("Mango");
        System.out.println(Quantity);
        System.out.println(Quantity.get("Mango"));
        System.out.println(Quantity.get("Goa"));
    }
}