import java.util.Scanner;

public class FindNthFibonacci {

    /**
     * Find the Nth Fibonacci sum value
     * Time-Complectiy: O(2^n)
     * Space-Complexity: O(1)
     * @param n
     * @return
     */
    public int findNthFibonacciValue(int n) {
        if (n <= 1) {
            return n;
        }
        return findNthFibonacciValue(n - 1) + findNthFibonacciValue(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to find sum of Fibonacci:");
        int input = scanner.nextInt();

        FindNthFibonacci findNthFibonacci = new FindNthFibonacci();
        int output = findNthFibonacci.findNthFibonacciValue(input);

        System.out.println(output);

    }
}
