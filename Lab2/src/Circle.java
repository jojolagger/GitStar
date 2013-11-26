import java.util.Scanner;

/**
 * Circle example for lab 2.
 * @author A00867948
 * @version 9001
 */
public class Circle {
    /**
     * Calculates area and circumference of circle.
     * @param args unused
     */
    public static void main(String[] args) {
        final double pi = 3.141592653589793238462643383279502884197169399375105;
        double radius;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value for the Radius:");
        radius = scan.nextDouble();
        scan.close();
        double circumference = pi * radius * 2;
        double area  = pi * radius * radius;
        System.out.println("The Circumference of a circle of radius "
        + radius + " is " + circumference + " and its area is "
        + area);            
    }

}
