import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr={18,19,22,30,35};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Key: ");
        int key=sc.nextInt();
        int flag=0;
        int l=0;
        int r=arr.length-1;
        while (l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==key){
                System.out.println("Element found");
                flag=1;
                break;
            }
            else if(arr[mid]<key){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        if(flag==0){
            System.out.println("Element Not Found");
        }
    }
}