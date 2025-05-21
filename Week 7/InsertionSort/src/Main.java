import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int arr[] = {88,77,11, 15, 5};
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}