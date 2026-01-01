package array.com;

public class Basic {
    public void basicEx(){
        // initialization
        int[] arr = {10,20,30,40,50,60,70};

        int n = arr.length;

        for(int i=0; i< arr.length; i++){

            //  print element
            System.out.print(arr[i]);

            // print index
            System.out.println(i);
        }

    }

    public static void main(String[] args) {

        Basic arraybasic = new Basic();
        arraybasic.basicEx();

    }
}
