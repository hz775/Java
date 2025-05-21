import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Collections.reverse(list);
        System.out.print("List: "+list);

    }
}