import shape.Rectangle;
import shape.Square;
import shape.Triangle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input for length and width
        System.out.println("Enter the Length (l): ");
        long l = input.nextLong();
        System.out.println("Enter the Width (b): ");
        long b = input.nextLong();

        // Create instances of each shape
        Rectangle ob1 = new Rectangle();
        Square ob2 = new Square();
        Triangle ob3 = new Triangle();

        // Calculate and display the areas
        ob1.area(l, b);  // For Rectangle
        ob2.area(l);      // For Square (only one side needed)
        ob3.area(l, b);   // For Triangle

        // Close the scanner
        input.close();
    }
}
