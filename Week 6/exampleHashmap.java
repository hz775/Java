import java.util.HashMap;
import java.util.Map;  
public class exampleHashmap{
	public static void main(String[] args){
		HashMap<String,Integer> map=new HashMap<>();
		map.put("India",120);
		map.put("China",130);
		map.put("veitnam",140);
		map.put("Pak",100);
		
		System.out.println(map);
		
		if(map.containsKey("India")){
			System.out.println("Key value is present in this map");
		}
		else{
			System.out.println("False");
		}  
		
		System.out.println(map.get("China"));
		System.out.println(map.get("Pak"));
		
		for(HashMap<String,Integer> e:map.entrySet()){
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	
	}
} 