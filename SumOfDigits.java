//20240426_BeachJonathan_Assignment6-2
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String [] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter an integer: "); 
            long integer = input.nextLong();
            int sum = sumDigits(integer);
            System.out.println("The sum of the digits is: " + sum);
        }
    }
    public static int sumDigits(long integer) {
        int sum = 0;
        
        while (integer > 0) {
            int digit = (int)(integer % 10);
            sum += digit;
            integer /= 10;
        }
        return sum;

    }
}
