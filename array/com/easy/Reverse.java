package array.com.easy;

public class Reverse {
    //1. approch
    public void reverse(int[] arr){
        for(int i= arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void reverseUsing2Pointer(int[] arr){
        int left =0;
        int right = arr.length-1;
       while(left < right){
         int temp = arr[left];
         arr[left] = arr[right];
         arr[right] = temp;
         left++;
         right--;
       }
    }

    static void reverseArray(int[] arr) {
        int n = arr.length;

        // Iterate over the first half
        // and for every index i, swap
        // arr[i] with arr[n - i - 1]
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 2, 6, 5};
        Reverse r = new Reverse();
        r.reverse(arr);
       // r.reverseUsing2Pointer(arr);
        reverseArray(arr);

        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
