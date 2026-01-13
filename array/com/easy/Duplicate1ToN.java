package array.com.easy;

import java.util.Arrays;
import java.util.HashSet;

public class Duplicate1ToN {

    // Function to find the duplicate
    // element in an array
    static int findDuplicate(int[] arr) {
        int n = arr.length;

        // Find the duplicate element
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j])
                    return arr[i];
            }
        }
        return -1;
    }


    // 2.approch
    static int findDuplicate1(int[] arr) {

        // Create a HashSet
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) {

            // If the element is already in the set
            if (set.contains(x))
                return x;
            set.add(x);
        }
        return -1;
    }


    //3rd approch
    static int findDuplicate2(int[] arr) {

        // Sort the array
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {

            // If the adjacent elements are equal
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 4};
        System.out.println(findDuplicate2(arr));
    }


}
