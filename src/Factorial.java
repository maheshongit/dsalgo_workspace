import java.util.Scanner;

public class Factorial {

    /**
     * Find the factorial of n
     * Time-Complexity: O(n)
     * Space-Complexity: O(1)
     * @param n
     * @return
     */
    public int findFactorial(int n) {
        if (n < 0) return -1;
        else if (n <= 1) return 1;

        return n * findFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find factorial:");
        int input = scanner.nextInt();

        Factorial factorial = new Factorial();
        int output = factorial.findFactorial(input);

        System.out.println("The Factorial of " + input + " is " + output);
    }
}
