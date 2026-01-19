package array.com.easy;

public class EquilibriumPoint {
    static int equilibriumPoint(int[] arr) {
        int prefSum = 0, total = 0;

        // Calculate the array sum
        for (int ele : arr) {
            total += ele;
        }

        // Iterate pivot over all the elements of the array
        for (int pivot = 0; pivot < arr.length; pivot++) {
            int suffSum = total - prefSum - arr[pivot];
            if (prefSum == suffSum) {
                return pivot;
            }
            prefSum += arr[pivot];
        }

        // There is no equilibrium point
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};

        System.out.println(equilibriumPoint(arr));

    }
}
