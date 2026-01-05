package array.com.algorithms;

public class TwoPointer {

    // 1. naive approch
    public static boolean twoSum(int[] arr, int x){
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i] + arr[j] == x){
                    return true;
                }
            }
        }
        return false;
    }

    // using two pointer
    public static boolean twoSum1(int arr[] , int target) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return  false;
    }


    public static void main(String[] args) {
        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;
        System.out.println(twoSum(arr, target));
        if (twoSum1(arr, target)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}
