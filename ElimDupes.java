//20240428_BeachJonathan_Assignment7.15
import java.util.Arrays;
import java.util.Scanner;

public class ElimDupes {
    public static int[] eliminateDuplicates(int[] list) {
        int[] distinctArray = new int[list.length];
        int distinctCount = 0;

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < distinctCount; j++) {
                if (list[i] == distinctArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                distinctArray[distinctCount] = list[i];
                distinctCount++;
            }
        }
        return Arrays.copyOf(distinctArray, distinctCount);
    }

    public static void main(String[] args) {
        int[] inputArray = new int[10];
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please enter ten numbers: ");
            for (int i = 0; i < 10; i++) {
                inputArray[i] = input.nextInt();
            }
        }
        int[] distinctNumbers = eliminateDuplicates(inputArray);

        System.out.print("The distinct numbers are: ");
        for (int num : distinctNumbers) {
            System.out.print(num + " ");
        }
    }
}
