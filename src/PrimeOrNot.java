import java.util.Scanner;

/**
 * Find a given number is prime or not using loop
 */
public class PrimeOrNot {

    /**
     * Find a given number is prime or not
     * Time-Complectiy: O(sqrt(n))
     * Space-Complexity: O(1) only one value as input
     * @param n Given input number
     * @return
     */
    public boolean findPrimeOrNot(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int input = scanner.nextInt();

        PrimeOrNot primeOrNot = new PrimeOrNot();
        boolean isprime = primeOrNot.findPrimeOrNot(input);
        System.out.println("The number " + input + " is a prime number = " + isprime);
    }
}
