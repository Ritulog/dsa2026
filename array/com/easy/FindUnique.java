package array.com.easy;

import java.util.HashMap;
import java.util.Map;

public class FindUnique {

    //1. brute force approch
    static int findUnique(int[] arr){
        for(int i=0; i< arr.length; i++){
            int count =0;
            for(int j=0; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                return arr[i];
            }
        }
        return -1;
    }

    //2. better approch
    static int findUnique1(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4};
        System.out.println(findUnique(arr));
        System.out.println(findUnique1(arr));
    }
}
