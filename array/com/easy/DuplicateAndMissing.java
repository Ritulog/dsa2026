package array.com.easy;

public class DuplicateAndMissing {

    static int[] findDuplicateAndMissing(int[] arr) {
        int n = arr.length;
        int duplicate = -1, missing = -1;

        for (int i = 1; i <= n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    count++;
                }
            }

            if (count == 2) {
                duplicate = i;
            }
            if (count == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 1, 3};
        int[] result1 = findDuplicateAndMissing(arr1);
        System.out.println("Duplicate: " + result1[0] + ", Missing: " + result1[1]);

        int[] arr2 = {4, 3, 6, 2, 1, 1};
        int[] result2 = findDuplicateAndMissing(arr2);
        System.out.println("Duplicate: " + result2[0] + ", Missing: " + result2[1]);
    }
}
