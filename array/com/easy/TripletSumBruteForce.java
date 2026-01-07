package array.com.easy;

public class TripletSumBruteForce {

    public static void findTriplets(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        System.out.println("(" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");
                    }
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
