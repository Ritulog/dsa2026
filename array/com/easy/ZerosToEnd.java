package array.com.easy;

public class ZerosToEnd {

    public void pushZerosToEnd(int[] arr){
        int n = arr.length;
        int temp[] = new int[n];

        //keep track of the index
        int j =0;

        //fill non-zero element
        for(int i=0; i< arr.length; i++){
            if(arr[i] != 0){
                temp[j++] = arr[i];
            }
        }

        // Fill remaining positions in temp[] with zeros
        while (j<n){
            temp[j++] = 0;
        }


        // Copy all the elements from temp[] to arr[]
        for(int i=0; i<n; i++){
            arr[i] = temp[i];
        }
    }

    // 2. better approch TC- 0(n), SC- o(1)
    public void zeroToEnd(int[] arr){

        // count of non zero element
        int count = 0;

        // If the element is non-zero, replace the element at
        // index 'count' with this element and increment count
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }

        // Now all non-zero elements have been shifted to
        // the front. Make all elements 0 from count to end.
        while (count < arr.length){
            arr[count++] = 0;
        }

    }

   public void zeroToEndWith1Iteration(int[] arr){
       // Pointer to track the position
       // for next non-zero element
       int count = 0;

       for (int i = 0; i < arr.length; i++) {

           // If the current element is non-zero
           if (arr[i] != 0) {

               // Swap the current element with
               // the 0 at index 'count'
               int temp = arr[i];
               arr[i] = arr[count];
               arr[count] = temp;

               // Move 'count' pointer to
               // the next position
               count++;
           }
       }

   }


    public static void main(String[] args) {
       int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
       ZerosToEnd z = new ZerosToEnd();
        //z.zeroToEnd(arr);
        z.zeroToEndWith1Iteration(arr);
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
