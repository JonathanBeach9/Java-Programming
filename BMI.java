//Jonathan Beach

import java.util.Scanner;

public class BMI {
    public static void main(String [] args) {
        try (Scanner input = new Scanner (System.in)) {
            System.out.println("Please enter your height(feet).");
            System.out.println("Please enter your height(inches)");
            System.out.println("Please enter your weight(pounds)");
            int feet = input.nextInt();
            int inches = input.nextInt();
            int pounds = input.nextInt();
            
            //formula for BMI = weight(lbs)/height(in^2)*703

            int BMI = (pounds * 703) / (((feet * 12) + inches) * ((feet * 12) + inches));

            if (BMI < 18.5) {
                System.out.println("You are underweight.");
            } else if (18.5 <= BMI && BMI < 25) {
                System.out.println("Your weight is normal.");
            } else if (25 <= BMI && BMI < 30) {
                System.out.println("You are overweight.");
            } else {
                System.out.println("You are obese.");
            } 
        }
    }

}
