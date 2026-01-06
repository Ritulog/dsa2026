package array.com.algorithms;

import java.util.ArrayList;

public class PrefixSum {

    static ArrayList<Integer> prifixSum(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i=1; i< arr.length; i++){
           list.add(list.get(i-1) + arr[i]);
        }
      return list;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 5, 15};
        ArrayList<Integer> list = prifixSum(arr);

        for(int v : list){
            System.out.print(v + " ");
        }
    }
}
