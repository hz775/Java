import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> set1=new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> set2=new ArrayList<>(Arrays.asList(1,2,3));
        if(set1.equals(set2)){
            System.out.print("True");
        }
    }
}