public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 33, 14, 15, 15};
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j > 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        for (int i = 0; i < length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}