import java.util.Scanner;

/**
 * Find a given number is prime or not - using recursion
 */
public class PrimeOrNotResursion {

    /**
     * Find a given number is prime or not
     * Time-Complectiy: O(sqrt(n))
     * Space-Complexity: O(1) only one value as input
     * @param n given input number
     * @return
     */
    public boolean isPrime(int n, int i) {
        if (n <= 1) {
            return false;
        }
        else if (i > Math.sqrt(n)) {
            return true;
        }
        else if (n % i == 0) {
            return false;
        }
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int input = scanner.nextInt();

        PrimeOrNotResursion primeOrNotResursion = new PrimeOrNotResursion();
        boolean output = primeOrNotResursion.isPrime(input, 2);
        System.out.println("The value " + input + " is a prime number=" + output);
    }
}
