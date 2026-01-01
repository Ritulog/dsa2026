package array.com;

public class JaggedArray {
    public static void main(String[] args) {

        // Declaring 2-D array with 2 rows
        int[][] arr = new int[2][];

        // Making the above array Jagged
        arr[0] = new int[2];
        arr[1] = new int[3];

        // Initializing array
        int count = 0;
        for(int i=0; i<=arr.length-1; i++){
            for(int j=0; j<=arr[i].length-1; j++){
                //System.out.println(arr[i][j]);
                arr[i][j] = count++;
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

    }
}
