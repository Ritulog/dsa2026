package array.com.easy;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate {

    // 1. approch (this logic could not work for sorted array)
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

    //2. approch
    public int removeEle(int[] arr){
        HashSet s = new HashSet<>();

        int idx = 0;
        for(int i=0; i< arr.length; i++){
            if(!s.contains(arr[i])){
                s.add(arr[i]);
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }

    //3.approch
    public int remove3(int[] arr){
        int n = arr.length;
        if(n<=1){
            return n;
        }

        // start form second element
        int idx = 1;
        for(int i=1; i<n; i++){
            if(arr[i] != arr[i-1]){
                arr[idx++] = arr[i];
            }
        }
        return  idx;
    }





    public static void main(String[] args) {
        int arr[] = {2, 2, 2, 2, 2};
        int arr1[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int arr2[] = {1, 2, 3};
        RemoveDuplicate r = new RemoveDuplicate();
        System.out.println(r.remove(arr1));

        int result1 = r.remove3(arr1);
        for(int i=0; i<result1; i++){
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        int result = r.removeEle(arr1);
        for(int i=0; i<result; i++){
            System.out.print(arr1[i] + " ");
        }

        System.out.println();
    }
}
