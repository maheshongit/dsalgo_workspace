import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {

    /**
     * Find the Fibonacci value upto n
     * Time-Complectiy: O(n * 2^n)
     * Space-Complexity: O(1)
     * @param n
     * @return
     */
    public int printFibonacciSeries(int n) {
        if (n <= 1) {
            return n;
        }
        return printFibonacciSeries(n - 1) + printFibonacciSeries(n - 2);
    }

    /**
     * Print the Fibonacci value upto n
     * Time-Complectiy: O(n+n) => O(n)
     * Space-Complexity: O(1)
     * @param n
     * @return
     */
    public void printFibonacciSeriesWithLoop(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                arr[i] = i;
            } else {
                arr[i] = arr[i-1] + arr[i-2];
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the maximum no to print Fibonacci series:");
        int input = scanner.nextInt();

        FibonacciSeries fibonacciSeries = new FibonacciSeries();

        for (int i = 0; i < input; i++) {
            System.out.println("i=" + i + " and "  + fibonacciSeries.printFibonacciSeries(i));
        }
    }
}
