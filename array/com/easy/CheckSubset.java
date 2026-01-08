package array.com.easy;

import java.util.HashSet;
import java.util.Set;

public class CheckSubset {

    //naive aaproch
    static boolean isSubset(int[] a, int[] b){
        for(int i=0; i<b.length; i++){
           // flag is used to track whether the current element of array b is found in array a or not.
            boolean flag = false; // assume b[i] is NOT found in a
            for(int j=0; j<a.length; j++){
                if(b[i] == a[j]){
                   flag =true;  // b[i]  found in a
                    b[i] =-1;
                    break;
                }
            }
            if(!flag){
               return false;  // b[i] not found in a
            }
        }
        return true;
    }


    // better appproch
    static boolean isSubset1(int[] a,int[] b) {
        // Create a hash set and insert all elements of a
        Set<Integer> hashSet = new HashSet<>();
        for (int num : a) {
            hashSet.add(num);
        }

        // Check each element of b in the hash set
        for (int num : b) {
            if (!hashSet.contains(num)) {
                return false;
            }
        }

        // If all elements of b are found in the hash set
        return true;
    }


    public static void main(String[] args) {
//        int[] a = {11, 1, 13, 21, 3, 7, 10};
//        int[] b = {11, 3, 7, 1,9};
       int a[] = {10, 5, 2, 23, 19}, b[] = {19, 5, 3};
        if(isSubset(a,b)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

}
