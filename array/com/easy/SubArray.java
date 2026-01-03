package array.com.easy;

import java.util.ArrayList;

public class SubArray {
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
    public static void main(String[] args) {
       ArrayList<Integer> arr = new ArrayList<>();
       arr.add(1);
       arr.add(2);
       arr.add(3);
       arr.add(4);
       System.out.println("All Non-empty Subarrays");
       SubArray s = new SubArray();
       s.subArrayEle(arr);
    }
}
