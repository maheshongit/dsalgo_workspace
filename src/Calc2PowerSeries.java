import java.util.Scanner;

public class Calc2PowerSeries {

    /**
     * Print the powerof 2 from 1 to n
     * Time-Complexity: O(log n)
     * Space-Complexity: O(1)
     * @param n
     * @return
     */
    public int printPowersofN(int n) {
        if (n < 1) {
            return 0;
        } else if (n == 1) {
            System.out.println(1);
            return 1;
        } else {
            int curr = 2 * printPowersofN(n / 2);
            System.out.println(curr);
            return curr;
        }
    }


    /**
     * Print the powerof 2 from 1 to n times
     * Time-Complexity: O(n)
     * Space-Complexity: O(1)
     * @param n
     * @return
     */
    public int printPowersofN1(int n) {
        if (n < 1) {
            return 0;
        } else if (n == 1) {
            System.out.println(1);
            return 1;
        } else {
            int val = 2 * printPowersofN1(n - 1);
            System.out.println(val);
            return val;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int input = scanner.nextInt();

        Calc2PowerSeries calc2PowerSeries = new Calc2PowerSeries();
        calc2PowerSeries.printPowersofN(input);
    }
}
