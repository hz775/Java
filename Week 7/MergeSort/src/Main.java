import java.util.Arrays;
public class Main {
    public static void merge(int[] arr,int L,int mid,int R) {
        int l = mid - L + 1;
        int r = R - mid;

        int leftArray[] = new int[l];
        int RightArray[] = new int[r];

        for (int i = 0; i <l; i++) {
            leftArray[i] = arr[L + i];
        }
        for (int j = 0; j <r; j++) {
            RightArray[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = L;
        while (i < l && j < r) {
            if (leftArray[i] <= RightArray[j]) {
                arr[k]=leftArray[i];
                i++;
            } else {
                arr[k]=RightArray[j];
                j++;
            }
            k++;

        }
        while (i < l) {
            arr[k]=leftArray[i];
            k++;
            i++;
        }
        while (j < r) {
            arr[k]=RightArray[j];
            k++;
            j++;
        }
    }
    public static void  mergesort(int[] arr,int L,int R){
        if(L<R){
            int mid=(L+R)/2;
            mergesort(arr,L,mid);
            mergesort(arr,mid+1,R);
            merge(arr,L,mid,R);

        }
    }


    public static void main(String[] args) {
        int[] arr={12,30,55,8,14};
        mergesort(arr,0,arr.length-1);
        System.out.print("Mergesort: "+Arrays.toString(arr));

    }
}