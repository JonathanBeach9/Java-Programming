//Jonathan Beach
import java.util.Scanner;

public class NumberOfDaysInMonth {
    public static void main(String [] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter the number of the month from 1 to 12.");
            System.out.println("Please enter the year.");
            int month = input.nextInt();
            int year = input.nextInt();
            
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.println("The number of days in this month is 31.");
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("The number of days in this month is 30.");
            } else if (month == 2 && year % 4 == 0) {
                System.out.println("The number of days in this month is 29.");
            } else if (month == 2 && year % 4 != 0) {
                System.out.println("The number of days in this month is 28.");
            } else {
                System.out.println("You did not enter a month and/or year, please try again.");
            }

        }
        
        

    }

    
}
