package array.com.easy;

public class Roatate {
    public void roatateArray(int[] arr, int d){
        int n = arr.length;

        //for raotation
        for(int i=0; i<d; i++){

            int last = arr[n-1];
            for(int j=n-1; j>0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }

        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }

    }

    static void rotateArr(int[] arr, int d) {
        int n = arr.length;

        // Handle case when d > n
        d %= n;

        // Storing rotated version of array
        int[] temp = new int[n];

        // Copy last d elements to the front of temp
        for (int i = 0; i < d; i++){
           // System.out.println(n-d+1);
            temp[i] = arr[n - d + i];
        }

        // Copy the first n - d elements to the back of temp
        for (int i = 0; i < n - d; i++){
            temp[i + d] = arr[i];
        }

        // Copying the elements of temp in arr to get the
        // final rotated array
        for (int i = 0; i < n; i++){
            arr[i] = temp[i];
        }

    }



    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int d = 2;
        Roatate  r = new Roatate();
        //r.roatateArray(arr, d);
        rotateArr(arr,d);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }


    }
}
