public class Main {
    public static void SelectionSort(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            int min_index = i;
            for (int j =i+1; j < length; j++) {
                if (arr[min_index] > arr[j])
                    min_index = j;
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args){
        int[] arr={100,21,44,54,66};
        SelectionSort(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}