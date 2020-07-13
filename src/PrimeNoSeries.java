import java.util.Scanner;

public class PrimeNoSeries {

    /**
     * Print prime numbers between start and end inputs
     * Time-Complectiy: O((end-start)) * sqrt(n))
     * Space-Complexity: O(1) only one value as input
     * @param start The staring value to find prime number
     * @param end The ending value to find prime number
     * @return
     */
    public void printPrimeSeries(int start, int end) {
        for (int i = start; i < end; i++) {
            if (findPrimeOrNot(i, 2)) {
                System.out.println("The value " + i + " is a prime number");
            }
        }
    }

//    public boolean findPrimeOrNot(int n) {
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

    public boolean findPrimeOrNot(int n, int i) {
        if (n <= 1) {
            return false;
        }
        else if (i > Math.sqrt(n)) {
            return true;
        }
        else if (n % i == 0) {
            return false;
        }
        return findPrimeOrNot(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter start number for prime:");
        int startInput = scanner.nextInt();

        System.out.println("Enter end number for prime:");
        int endInput = scanner.nextInt();

        PrimeNoSeries primeNoSeries = new PrimeNoSeries();
        primeNoSeries.printPrimeSeries(startInput, endInput);
    }
}
