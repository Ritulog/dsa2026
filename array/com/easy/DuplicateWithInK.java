package array.com.easy;

import java.util.HashSet;

public class DuplicateWithInK {
     static String checkDuplicateWithInK(int[] arr, int k){
         int n = arr.length;
         for(int i=0; i<n; i++){
             for(int j=1; j <= k && (i + j) < n; j++){
                 int y = i+j;
                 if(arr[i] == arr[y]){
                     return "yes";
                 }
             }
         }
         return "No";
    }



    //2. better approch
    static boolean checkDuplicatesWithinK(int arr[], int k)
    {
        // Creates an empty hashset
        HashSet<Integer> set = new HashSet<>();

        // Traverse the input array
        for (int i=0; i<arr.length; i++)
        {
            // If already present n hash, then we found
            // a duplicate within k distance
            if (set.contains(arr[i]))
                return true;

            // Add this item to hashset
            set.add(arr[i]);

            // Remove the k+1 distant item
            if (i >= k)
                set.remove(arr[i-k]);
        }
        return false;
    }


    public static void main(String[] args) {
      int  k = 3, arr[] = {1, 2, 3, 4, 1, 2, 3, 4};
      int arr1[] = {1, 2, 3, 1, 4, 5};
      int arr2[] = {1, 2, 3, 4, 5};


      System.out.println(checkDuplicateWithInK(arr2, k));
        if (checkDuplicatesWithinK(arr, 3))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
