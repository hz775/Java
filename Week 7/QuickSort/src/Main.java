import java.util.Arrays;

public class Main {
    public static void QuickSort(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }

            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        QuickSort(arr, low, end);
        QuickSort(arr, start, high);
    }

    public static void main(String[] args) {
        int[] Productprices = { 99, 6, 33,55,99};
        System.out.println("Original array: " + Arrays.toString(Productprices));
        QuickSort(Productprices, 0, Productprices.length - 1);
        System.out.println("Sorted array:   " + Arrays.toString(Productprices));
    }
}



