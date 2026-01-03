package array.com.easy;

import java.util.*;

class SubArrayRecursive {

    public List<List<Integer>> getSubArrays(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        generateFromStart(0, arr, result);
        return result;
    }

    // Fix the starting index
    private void generateFromStart(int start, int[] arr, List<List<Integer>> result) {
        if (start == arr.length) {
            return;
        }

        generateSubarrays(start, start, arr, new ArrayList<>(), result);
        generateFromStart(start + 1, arr, result);
    }

    // Extend subarray length
    private void generateSubarrays(int start, int end, int[] arr,
                                   List<Integer> current, List<List<Integer>> result) {
        if (end == arr.length) {
            return;
        }

        current.add(arr[end]);
        result.add(new ArrayList<>(current));

        generateSubarrays(start, end + 1, arr, current, result);

        // backtrack
        current.remove(current.size() - 1);
    }

    // psvm added here
    public static void main(String[] args) {
        SubArrayRecursive sol = new SubArrayRecursive();

        int[] arr1 = {1, 2, 3};
        System.out.println(sol.getSubArrays(arr1));

        int[] arr2 = {1, 2};
        System.out.println(sol.getSubArrays(arr2));

        int[] arr3 = {1, 1};
        System.out.println(sol.getSubArrays(arr3));
    }
}
