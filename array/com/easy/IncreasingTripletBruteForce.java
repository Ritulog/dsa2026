package array.com.easy;

public class IncreasingTripletBruteForce {

    public static void findTriplet(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {

                    if (arr[i] < arr[j] && arr[j] < arr[k]) {
                        System.out.println(arr[i] + ", " + arr[j] + ", " + arr[k]);
                        return;
                    }
                }
            }
        }

        System.out.println("No such triplet exists.");
    }

    public static void main(String[] args) {
        findTriplet(new int[]{12, 11, 10, 5, 6, 2, 30});
        findTriplet(new int[]{1, 2, 3, 4});
        findTriplet(new int[]{4, 3, 2, 1});
    }
}
