import java.util.Scanner;

public class FindSquareRoot {

    /**
     * Find the square root of a number using loop
     * Time-Complexity: O(sqrt(n))
     * Space-Complexity: O(1)
     * @param n
     * @return
     */
    public int findSquareRootNumber(int n) {
        if (n <= 0) return n;

        for (int i = 2; i * i <= n; i++) {
            if (i * i == n) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Find the square root of a number using recursion
     * Time-Complexity: O(log n) - since using binary search like approach
     * Space-Complexity: O(1)
     * @param n
     * @param min
     * @param max
     * @return
     */
    public int findSquareRootNumberRecursion(int n, int min, int max) {
        if (max < min) return -1;

        int guess = (min + max) / 2;
        if (guess * guess == n) {
            return guess;
        } else if (guess * guess > n) {
            return findSquareRootNumberRecursion(n, min, guess - 1);
        } else {
            // (guess * guess < n)
            return findSquareRootNumberRecursion(n, guess + 1, max);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find square its root:");
        int input = scanner.nextInt();

        FindSquareRoot findSquareRoot = new FindSquareRoot();
        int output = findSquareRoot.findSquareRootNumber(input);
        int outputRecursion = findSquareRoot.findSquareRootNumberRecursion(input, 1, input);

        System.out.println("The Square root of " + input + " is " + output);
        System.out.println("The Square root of " + input + " using recursion is " + outputRecursion);

    }
}
