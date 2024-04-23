//Jonathan Beach
import java.util.Scanner;

public class Temperature {
    public static void main (String [] args) {
    System.out.println("Please enter the temperature in Celsius");
    try (Scanner input = new Scanner(System.in)) {
        double Celsius = input.nextDouble();
        //Conversion from Celsius to Fahrenheit is (9/5)C+32
        double Fahrenheit = (9.0/5)*Celsius + 32;
        System.out.println("The temperature in Fahrenheit is " + Fahrenheit + " degrees.");
    }
    }
    
}
