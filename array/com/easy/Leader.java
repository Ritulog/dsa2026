package array.com.easy;

import java.util.ArrayList;
import java.util.Collections;

public class Leader {

    // naive approch
    public ArrayList<Integer> findLeaderEle(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            int j;
            for( j=i+1; j<n; j++){
                if(arr[i] < arr[j]){
                    break;
                }
            }
            if(j==n){
                list.add(arr[i]);
            }
        }
        return list;
    }

    //better approch
    public ArrayList<Integer> findLeader(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int maxEle = arr[n-1];
        list.add(maxEle);
        for(int i=n-2; i>=0; i--){
            if(arr[i] > maxEle){
                maxEle = arr[i];
                list.add(maxEle);
            }
        }
        Collections.reverse(list);
        return list;
    }


    public static void main(String[] args) {
       int arr[] = {16, 17, 4, 3, 5, 2};
       Leader l = new Leader();
        ArrayList<Integer> result = l.findLeader(arr);

        for (int res : result) {
            System.out.print(res + " ");
        }
        System.out.println();
    }
}
