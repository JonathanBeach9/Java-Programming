//Jonathan Beach
import java.util.Scanner;

public class GratuityAndTotal {
    public static void main(String [] args) {
        System.out.println("Enter the subtotal");
        System.out.println("Enter the gratuity rate");
        try (Scanner input = new Scanner(System.in)) {
            double Subtotal = input.nextDouble();
            double GratuityRate = input.nextDouble();
            double Gratuity = Subtotal * (GratuityRate/100);
            double Total = Subtotal + (Subtotal * (GratuityRate/100));
            System.out.println("The gratuity is $" + Gratuity);
            System.out.println("The total is $" + Total);
        }
        
        
    }
    
    
}
