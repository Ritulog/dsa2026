package array.com.easy;

import java.util.Arrays;

public class TripletSumOptimized {

    public static void findTriplets(int[] arr, int target) {
        int n = arr.length;

        Arrays.sort(arr); // Step 1

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    System.out.println("(" + arr[i] + ", " + arr[left] + ", " + arr[right] + ")");
                    left++;
                    right--;
                } 
                else if (sum < target) {
                    left++;
                } 
                else {
                    right--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 3, 4, 1, 6, 9};
        int target = 24;

        findTriplets(array, target);
    }
}
