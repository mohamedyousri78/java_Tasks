
public class QuickSort {
    public static void quick(int begin, int end, int arr[]) {
        if (begin >= end) {
            return;
        }
        int seed = arr[(begin + end) / 2];
        int i = begin;
        int j = end;
        while (i < j) {
            if (arr[i] < seed) {
                i++;
            } else if (arr[j] > seed) {
                j--;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        quick(begin, i - 1, arr);
        quick(i + 1, end, arr);
    }
    
}
