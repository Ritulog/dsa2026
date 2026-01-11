package array.com.easy;

public class MissingNumber {

    //1.brute force approch
    static int missingElement(int[] arr){
        int n = arr.length + 1;
        for(int i=1; i<n; i++){
            boolean found = false;
            for(int j=0; j<n-1; j++){
                if(arr[j] == i){
                    found = true;
                    break;
                }
            }
            if(!found){
                return i;
            }
        }

       return -1;
    }


    //2. using hasing
    static int missingUsinghash(int[] arr){
        int n = arr.length+1;
        int hash[] = new int[n+1];
        for(int i=0; i<n-1; i++){
            hash[arr[i]]++;
        }

        for(int i=1; i<=n; i++){
            if(hash[i] == 0){
                return i;
            }
        }
        return  -1;
    }


    public static void main(String[] args) {
       int arr[] = {8, 2, 4, 5, 3, 7, 1};
       System.out.println(missingElement(arr));
       System.out.println(missingUsinghash(arr));


    }
}
