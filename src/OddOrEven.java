import java.util.Scanner;

public class OddOrEven {

    /**
     * Find a given number is odd or even
     * Time-Complectiy: O(1)
     * Space-Complexity: O(1) only one value as input
     * @param value Given input number
     * @return
     */
    public boolean isEvenValue(int value) {
        return (value % 2 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        OddOrEven oddOrEven = new OddOrEven();
        boolean output = oddOrEven.isEvenValue(input);

        System.out.println("The value " + input + " is" + (output ? " even" : " odd") + " value");

    }
}
