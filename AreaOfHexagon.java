//Jonathan Beach
import java.util.Scanner;

public class AreaOfHexagon {
    public static void main(String [] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter the side length of a hexagon.");
            double side = input.nextDouble();

            double Area = (6 * Math.pow(side,2))/(4 * Math.tan(Math.PI/6));

            System.out.println("The area of the hexagon is " + Area + ".");
        }
            
        
            
        
    }
    
}
