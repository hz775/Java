import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr={12,18,17,43,25};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter key: ");
        int key=sc.nextInt();
        boolean found=false;
        for (int i=0;i< arr.length;i++){
            if(arr[i]==key){
                System.out.println("Element found at: "+i);
                found=true;
                break;
            }
        }
        if(!found) {
            System.out.println("Element not found");
        }

    }
}