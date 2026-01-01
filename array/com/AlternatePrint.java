package array.com;

import java.util.ArrayList;

public class AlternatePrint {
    public ArrayList<Integer> getAlternate(int[] arr){
        ArrayList<Integer> alternate = new ArrayList<>();
        for(int i=0; i< arr.length; i=i+2){
            alternate.add(arr[i]);
        }
        return  alternate;
    }

    public static void main(String[] args) {
        int[] arr ={10,20,30,40,50,60};
        AlternatePrint a = new AlternatePrint();
        System.out.println(a.getAlternate(arr));
    }
}
