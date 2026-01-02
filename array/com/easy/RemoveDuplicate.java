package array.com.easy;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate {

    // 1. approch
    public ArrayList<Integer>  remove(int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        if(arr.length < 0){
            return result;
        }
        result.add(arr[0]);
        for(int i=1; i< arr.length; i++){
            if(arr[i] != arr[i-1]){
                result.add(arr[i]);
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int arr[] = {2, 2, 2, 2, 2};
        int arr1[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int arr2[] = {1, 2, 3};
        RemoveDuplicate r = new RemoveDuplicate();
        System.out.println(r.remove(arr1));
    }
}
