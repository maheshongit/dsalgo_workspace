import java.util.Scanner;

public class StringPermutation {

    /**
     * Print all the permutation of the given string
     * Time-Complexity: O(n * n!)
     * Space-Complexity: O(1)
     * @param input
     * @param prefix
     */
    public void permutationRecursion(String input, String prefix) {
        if (input.length() == 0) {
            System.out.println(prefix);
        }

        for (int i = 0; i < input.length(); i++) {
            String rem = input.substring(0, i) + input.substring(i + 1);
            permutationRecursion(rem, prefix + input.charAt(i));
        }
    }

    /**
     * Print all the permutation of the given string
     * Time-Complexity: O(n * n!)
     * Space-Complexity: O(1)
     * @param input
     * @param currentIndex
     */
    public void permutationRecursionBacktracking(char[] input, int currentIndex) {
        if (currentIndex == input.length - 1) {
            System.out.println(input);
        }

        for (int i = currentIndex; i < input.length; i++) {
            swap(input, currentIndex, i);
            permutationRecursionBacktracking(input, currentIndex + 1);
            swap(input, currentIndex, i);
        }
    }

    private void swap(char[] input, int i, int j) {
        char temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String to find Permuatation:");
        String input = scanner.next();

        StringPermutation stringPermutation = new StringPermutation();
        stringPermutation.permutationRecursion(input, "");
        stringPermutation.permutationRecursionBacktracking(input.toCharArray(), 0);
        //stringPermutation.permutationsLoop(input);

    }

}
