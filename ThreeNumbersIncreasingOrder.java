//202040426_BeachJonathan_Assignment6-5

import java.util.Scanner;

public class ThreeNumbersIncreasingOrder {
    public static void main(String [] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter a number: ");
            System.out.println("Please enter another number: ");
            System.out.println("Please enter another number: ");
            double num1 = input.nextDouble();
            double num2 = input.nextDouble();
            double num3 = input.nextDouble();
            displaySortedNumbers(num1, num2, num3);
        }}
        public static void displaySortedNumbers(double num1, double num2, double num3) {
            double n;
            if (num1 < num2) {
                n = num1;
                num1 = num2;
                num2 = n;
            } if (num1 < num3) {
                n = num1;
                num1 = num3;
                num3 = n;
            } if (num2 < num1) {
                n = num2;
                num2 = num1;
                num1 = n;
            } if (num2 < num3) {
                n = num2;
                num2 = num3;
                num3 = n;
            } if (num3 < num1) {
                n = num3;
                num3 = num1;
                num1 = n;
            } if (num3 < num2) {
                n = num3;
                num3 = num2;
                num2 = n;
            } System.out.println(num1 + " " + num2 + " " + num3);
        
    }
}
