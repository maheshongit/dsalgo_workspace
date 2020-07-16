import java.util.Scanner;

public class FindDivisor {

    /**
     * Find the division of given number (a, b) without using / operator
     * Time-Complexity: O(a/b)
     * Space-Complexity: O(1)
     * @param a
     * @param b
     * @return
     */
    public int findDivisor(int a, int b) {
        int count = 0;
        int sum = b;
        while (sum <= a ) {
            sum += b;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = scanner.nextInt();
        System.out.println("Enter the value of b:");
        int b = scanner.nextInt();

        FindDivisor findDivisor = new FindDivisor();
        int output = findDivisor.findDivisor(a, b);

        System.out.println("The Divisor of " + a + " and " + b + " is " + output);
    }
}
