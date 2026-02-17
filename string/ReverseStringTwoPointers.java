package string;

public class ReverseStringTwoPointers {

    public static String reverse(String str) {
        char[] arr = str.toCharArray();
        
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // swap
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String input = "Ritu";
        String result = reverse(input);
        System.out.println(result);
    }
}
