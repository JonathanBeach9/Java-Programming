//20240428_BeachJonathan_Assignment7.8
import java.util.Scanner;

public class AvgOfArray {
    public static int average(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0.0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double[] values = new double[10];
            System.out.println("Enter 10 double values:");
            for (int i = 0; i < 10; i++) {
                values[i] = input.nextDouble();
            }

            int intAverage = (int) average(values);
            double doubleAverage = average(values);
            System.out.println("Average (int): " + intAverage);
            System.out.println("Average (double): " + doubleAverage);
        }
    }
}



