import java.util.Arrays;

public class QuicksortMK {

    private int getPivot(int[] arr) {
//    sets pivot to the last element of array
        int pivotIndex = arr.length-1;
        return arr[pivotIndex];
    }

    private void swap(int arr[], int i, int j) {
//    swaps two values in array
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void quicksort(int arr[], int leftIndex, int rightIndex) {
        if(leftIndex < rightIndex) {
            int partitionIndex = partition(arr, leftIndex, rightIndex);
            quicksort(arr, leftIndex, partitionIndex - 1);
            quicksort(arr, partitionIndex + 1, rightIndex);
        }
    }

    public int partition(int[] arr, int leftIndex, int rightIndex) {
        int pivot = getPivot(arr);
        int i = leftIndex-1;

        for(int j = leftIndex; j < rightIndex; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, rightIndex);
        return i+1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        QuicksortMK ob = new QuicksortMK();
        ob.quicksort(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }
}

