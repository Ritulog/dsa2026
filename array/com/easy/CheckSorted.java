package array.com.easy;

public class CheckSorted {
    public boolean isSorted(int[] arr){

        for(int i=1; i<arr.length; i++ ){
            if(arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        CheckSorted cs = new CheckSorted();
        System.out.println(cs.isSorted(arr));
    }
}
