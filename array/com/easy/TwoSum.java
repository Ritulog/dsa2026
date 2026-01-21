package array.com.easy;

import java.util.Arrays;

public class TwoSum {

    // naive approch
    static boolean twoSum(int[] arr, int target){
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    //better approch
    static boolean binarySearch(int[] arr, int left,
                                int right, int target){
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return true;
            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }


    static boolean twoSum1(int[] arr, int target){

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            // Use binary search to find the complement
            if (binarySearch(arr, i + 1, arr.length - 1,
                    complement))
                return true;
        }
        // If no pair is found
        return false;
    }


    // using two pointer
    static boolean twoSum2(int[] arr, int target){

        Arrays.sort(arr);

        int left = 0, right = arr.length - 1;

        // Iterate while left pointer is less than right
        while (left < right) {
            int sum = arr[left] + arr[right];

            // Check if the sum matches the target
            if (sum == target)
                return true;
            else if (sum < target)

                // Move left pointer to the right
                left++;
            else

                // Move right pointer to the left
                right--;
        }
        // If no pair is found
        return false;
    }



    public static void main(String[] args) {
        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;

        if (twoSum(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
