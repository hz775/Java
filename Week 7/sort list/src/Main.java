import java.util.*;
public class Main {
    public static void main(String[] args) {
        Set<Integer> input=new HashSet<>(Arrays.asList(1,13,0,2,17));
        List<Integer> list=new ArrayList<>(input);
        Collections.sort(list);
        System.out.print(list);
    }
}