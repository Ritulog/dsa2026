package array.com.easy;

import java.util.ArrayList;
import java.util.List;

public class SubArray {

    //1. brute force
    public void subArrayEle(ArrayList<Integer> arr){
        int n = arr.size();
        //pick starting point
        for(int i=0; i<n; i++){
            for(int j =i; j<n; j++){
                for(int k =i; k<=j; k++){
                    System.out.print(arr.get(k) + " ");
                }
                System.out.println();
            }
        }

    }

    //2. optimize approch
    static void generateSubarrays(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            List<Integer> subarray = new ArrayList<>();

            for (int j = i; j < n; j++) {
                subarray.add(arr[j]);     // extend subarray
                System.out.println(subarray);
            }
        }
    }



    public static void main(String[] args) {
       ArrayList<Integer> arr = new ArrayList<>();
       arr.add(1);
       arr.add(2);
       arr.add(3);
       arr.add(4);
       System.out.print("All Non-empty Subarrays");
       SubArray s = new SubArray();
       s.subArrayEle(arr);

       int[] arr2 = {1,2,3};
       generateSubarrays(arr2);

    }
}
