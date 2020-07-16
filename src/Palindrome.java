import java.util.Scanner;

public class Palindrome {

    /**
     * Check whether given string is a palindrome using loop
     * Time-Complexity: O(n) - only goes through half the input string still its O(n)
     * Space-Complexity: O(1) - no extra space is used
     * @param input
     * @return
     */
    public boolean isPalindrome(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Check whether given string is a palindrome using recursion
     * Time-Complexity: O(n) - only goes through half the input string still its O(n)
     * Space-Complexity: O(1)
     * @param input
     * @param first
     * @param last
     * @return
     */
    public boolean isPalindromeRecursion(String input, int first, int last) {
        if (input.charAt(first) != input.charAt(last)) {
            return false;
        } else if (first >= last) {
            return true;
        }
        return isPalindromeRecursion(input, first + 1, last - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input string:");
        String input = scanner.nextLine();

        Palindrome palindrome = new Palindrome();
        boolean output = palindrome.isPalindrome(input);
        boolean outputRecursion = palindrome.isPalindromeRecursion(input, 0, input.length() - 1);

        System.out.println("The input " + input + (output ? " is a palindrome" : " is not a palindrome"));
        System.out.println("The input " + input + (outputRecursion ? " is a palindrome (using recursion)" : " is not a palindrome (using recursion)"));
    }
}
