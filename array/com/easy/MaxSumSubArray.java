package array.com.easy;

public class MaxSumSubArray {

    static int UsingKadanesAlgorithm(int[] a){
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        int s=0, start=0, end =0;
        for(int i=0; i< a.length; i++){
            max_ending_here = max_ending_here + a[i];
            start=s;
            end =i;
            if(max_so_far < max_ending_here){
                max_so_far = max_ending_here;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
                s = i+1;
            }
        }
        System.out.println(max_so_far);
        System.out.println("starting index position of sub array is" + start + " and ending index position is" + end);

        return max_so_far;

    }

    // 2nd method
    public static int maxSubArraySum(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }


    public static void main(String[] args) {
      int[] a = {4,-2,-3,4,-1,-2,1,5,-3};
      System.out.println(UsingKadanesAlgorithm(a));
        System.out.println(maxSubArraySum(a));

    }
}
