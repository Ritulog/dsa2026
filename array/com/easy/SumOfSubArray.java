package array.com.easy;

public class SumOfSubArray {


    // brute force
    static int sumOfAllSubarrays(int[] arr) {
        int n = arr.length;
        int totalSum = 0;

        // start index
        for (int i = 0; i < n; i++) {
            // end index
            for (int j = i; j < n; j++) {
                // calculate sum of subarray arr[i..j]
                for (int k = i; k <= j; k++) {
                    totalSum += arr[k];
                }
            }
        }
        return totalSum;
    }


    // better approch
    static int sumOfAllSubarrays1(int[] arr) {
        int n = arr.length;
        int totalSum = 0;

        // start index
        for (int i = 0; i < n; i++) {
            int currentSum = 0;

            // end index
            for (int j = i; j < n; j++) {
                currentSum += arr[j];   // extend subarray
                totalSum += currentSum; // add subarray sum
            }
        }
        return totalSum;
    }



    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 3, 2};
        int[] arr2 = {1, 2, 3, 4};

        System.out.println(sumOfAllSubarrays(arr1)); // 116
        System.out.println(sumOfAllSubarrays1(arr2)); // 50
    }
}
