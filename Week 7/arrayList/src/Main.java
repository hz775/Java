import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int[] a={1,12,13,24,55};
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        int length=a.length;
        for(int num:a) {
            if (num % 2 == 0) {
                arr1.add(num);
            } else {
                arr2.add(num);
            }
        }
        System.out.print("Even no are: ");
        for(int no:arr1){
            System.out.print(no+" ");
        }

        System.out.print("\n");
        System.out.print("Odd no are: ");
        for(int no:arr2){
            System.out.print(no+" ");
        }
    }
}