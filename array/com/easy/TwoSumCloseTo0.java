package array.com.easy;

import java.util.Arrays;

public class TwoSumCloseTo0 {
    static int minAbsSumPair(int[] arr) {

        // Initialize the result with the sum
        // of the first two elements
        int res = arr[0] + arr[1];

        // Consider every pair, find its sum and
        // update result if we get a smaller value
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (Math.abs(sum) < Math.abs(res)) {
                    res = sum;
                }

                else if (Math.abs(sum) == Math.abs(res)) {
                    res = Math.max(res, sum);
                }
            }
        }
        return res;
    }


    // better approch
    static int minAbsPair(int[] arr) {

            Arrays.sort(arr);

            int n = arr.length;

            int res = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {

                int x = arr[i];

                int left = i + 1, right = n - 1;

                while (left <= right) {
                    int mid = (left + right) / 2;

                    int curr = arr[mid] + x;

                    // If exact pair is found
                    if (curr == 0) {
                        return 0;
                    }

                    if (Math.abs(curr) < Math.abs(res)) {
                        res = curr;
                    }

                    else if (Math.abs(curr) == Math.abs(res)) {
                        res = Math.max(res, curr);
                    }

                    if (curr < 0) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }

            return res;
        }


    public static void main(String[] args) {
        int[] arr = { 0, -8, -6, 3 };
        System.out.println(minAbsSumPair(arr));
    }
}
