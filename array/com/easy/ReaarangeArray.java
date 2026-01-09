package array.com.easy;

public class ReaarangeArray {
    static void zigZag(int[] arr) {
        int n = arr.length;

        // i represents 1-based index, so actual array index is i-1
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) { // even index
                if (arr[i - 1] < arr[i - 2]) {
                    swap(arr, i - 1, i - 2);
                }
            } else { // odd index
                if (arr[i - 1] > arr[i - 2]) {
                    swap(arr, i - 1, i - 2);
                }
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
       int arr[] = {1, 2, 2, 1};
       zigZag(arr);
       for(int element : arr){
           System.out.print(element + " ");
       }

    }

}
