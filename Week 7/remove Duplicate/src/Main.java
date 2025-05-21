import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Integer> input= Arrays.asList(3, 10, 9, 9, 10, 1, 4, 4, 1, 5, 2, 2, 3, 4);

        List<Integer> result = removeDuplicates(input);

        System.out.println(result);
    }

    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> Seen=new HashSet<>();
        List<Integer> result=new ArrayList<>();

        for(int num: list){
            if(!Seen.contains(num)){
                Seen.add(num);
                result.add(num);
            }
        }
        return result;
    }
}