import java.util.Scanner;

public class CalculatePower {

    /**
     * Calculate the Power of given inputs a and b such that a^b
     * Time-Complexity: O(b)
     * Space-Complexity: O(1)
     * @param a
     * @param b
     * @return
     */
    public int findPower(int a, int b) {
        if (b < 0) {
            return 0;
        } else if (b == 0) {
            return 1;
        }
        return a * findPower(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = scanner.nextInt();
        System.out.println("Enter the value of b:");
        int b = scanner.nextInt();

        CalculatePower calculatePower = new CalculatePower();
        int output = calculatePower.findPower(a, b);

        System.out.println("Value of a^b: " + output);
    }
}
