package array.com.easy;

public class DuplicateAndMissingOptimized {

    static int[] findDuplicateAndMissing(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n + 1];

        // Count frequency
        for (int num : arr) {
            freq[num]++;
        }

        int duplicate = -1, missing = -1;

        // Find duplicate and missing
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                duplicate = i;
            }
            if (freq[i] == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 1, 3};
        int[] res1 = findDuplicateAndMissing(arr1);
        System.out.println("Duplicate: " + res1[0] + ", Missing: " + res1[1]);

        int[] arr2 = {4, 3, 6, 2, 1, 1};
        int[] res2 = findDuplicateAndMissing(arr2);
        System.out.println("Duplicate: " + res2[0] + ", Missing: " + res2[1]);
    }
}
