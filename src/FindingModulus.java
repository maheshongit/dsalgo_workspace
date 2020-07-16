import java.util.Scanner;

public class FindingModulus {

    /**
     * Calculate the mod of a, b without using % operator
     * Time-Complexity: O(1)
     * Space-Complexity: O(1)
     * @param a
     * @param b
     * @return
     */
    public int calculateModulus(int a, int b) {
        if (b <= 0) {
            return -1;
        }
        int fact = a / b;
        return a - (b * fact);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = scanner.nextInt();
        System.out.println("Enter the value of b:");
        int b = scanner.nextInt();

        FindingModulus findingModulus = new FindingModulus();
        int output = findingModulus.calculateModulus(a, b);

        System.out.println("The mod of " + a + " and " + b + " is " + output);
    }
}
