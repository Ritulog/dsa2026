package array.com.easy;

public class IncreasingTriplet {

    public static void findTriplet(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            System.out.println("No such triplet exists.");
            return;
        }

        int[] leftMin = new int[n];
        int[] rightMax = new int[n];

        // Step 1: Build leftMin[]
        leftMin[0] = -1;
        int minIndex = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] <= arr[minIndex]) {
                minIndex = i;
                leftMin[i] = -1;
            } else {
                leftMin[i] = minIndex;
            }
        }

        // Step 2: Build rightMax[]
        rightMax[n - 1] = -1;
        int maxIndex = n - 1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= arr[maxIndex]) {
                maxIndex = i;
                rightMax[i] = -1;
            } else {
                rightMax[i] = maxIndex;
            }
        }

        // Step 3: Find triplet
        for (int j = 0; j < n; j++) {
            if (leftMin[j] != -1 && rightMax[j] != -1) {
                System.out.println(
                    arr[leftMin[j]] + ", " + arr[j] + ", " + arr[rightMax[j]]
                );
                return;
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
