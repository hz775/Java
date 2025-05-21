import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> NewList= new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange"));
        Map<String,Integer> frequencyMap=new HashMap<>();
        for (String item:NewList){
            if(frequencyMap.containsKey(item)){
                frequencyMap.put(item, frequencyMap.get(item)+1);
            }else{
                frequencyMap.put(item,1);
            }
        }
        System.out.println(frequencyMap);

    }
}