import java.util.Scanner;

public class ReverseArray {

    /**
     * Reverse the given array using Loop
     * Time-Complexity: O(n/2) => O(n)
     * Space-Complexity: O(n)
     * @param array
     * @return
     */
    public String[] reverseArrayUsingLoop(String[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    /**
     * Reverse the given array using Recursion
     * Time-Complexity: O(n/2) => O(n)
     * Space-Complexity: O(n)
     * @param array
     * @param first
     * @param last
     * @return
     */
    public String[] reverseArrayUsingRecursion(String[] array, int first, int last) {
        if (first < array.length / 2) {
            String temp;
            temp = array[first];
            array[first] = array[last];
            array[last] = temp;
            reverseArrayUsingRecursion(array, first + 1, last - 1);
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of the array to be reversed sepeatedby comma");
        String inputValues = scanner.next();
        String[] arr = inputValues.split(",");
        String[] arrCopy = arr.clone();
        System.out.println("Input Array Values:" + String.join(",", arr));

        ReverseArray reverseArray = new ReverseArray();
        String[] outputValue = reverseArray.reverseArrayUsingLoop(arr);
        String[] outputValueRecursion = reverseArray.reverseArrayUsingRecursion(arrCopy, 0, arr.length - 1);

        System.out.println("output Array Values:" + String.join(",", outputValue));
        System.out.println("output Array Values using recursion:" + String.join(",", outputValueRecursion));

    }
}
