import java.util.Scanner;

public class OddOrEvenSeries {

    /**
     * Find a given number is odd or even
     * Time-Complectiy: O(1)
     * Space-Complexity: O(1) only one value as input
     * @param start Given input number
     * @param end Given input number
     * @return
     */
    public void printOddEvenSeries(int start, int end) {
        if (start <= 1 ) {
            System.out.println(start +" is not an odd or even");
        } else if(start % 2 == 0) {
            System.out.println(start + " is an even number");
        } else {
            System.out.println(start + " is an odd number");
        }

        if (start < end) {
            printOddEvenSeries(start + 1, end);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter start number:");
        int startInput = scanner.nextInt();

        System.out.println("Enter end number:");
        int endInput = scanner.nextInt();

        OddOrEvenSeries oddOrEvenSeries = new OddOrEvenSeries();
        oddOrEvenSeries.printOddEvenSeries(startInput, endInput);

    }
}
