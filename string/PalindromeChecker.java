package string;

public class PalindromeChecker {

    private String str;

    // Constructor
    public PalindromeChecker(String str) {
        this.str = str;
    }

    // Method to check palindrome
    public boolean isPalindrome() {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker("abba");

        if (checker.isPalindrome()) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
