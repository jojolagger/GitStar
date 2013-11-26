import java.util.Scanner;
/**
 * Painting Example for lab 2.
 * @author A00867949
 * @version 9001
 */
public class PaintingARoom {
    /**
     * Window Area.
     */
    public static final int WINDOWAREA = 15;
    /**
     * Door Area.
     */
    public static final int DOORAREA = 20;
    /**
     * Calculates paint needed to paint a room.
     * @param args unused
     */
    public static void main(String[] args) {
        final int coverage = 350; //Paint covers 350 sq ft/gal
                int length;
                int width;
                int height;
                int doors;
                int windows;
                double totalSqFt;
                double paintNeeded;
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter length of room:");
                length = scan.nextInt();
                System.out.print("\nEnter width of room:");
                width = scan.nextInt();
                System.out.print("\nEnter height of room:");
                height = scan.nextInt();
                System.out.print("\nEnter number of windows:");
                windows = scan.nextInt();
                System.out.print("\nEnter number of doors:");
                doors = scan.nextInt();
                scan.close();
                totalSqFt = (2 * ((length * height) + (width * height)))
                - ((WINDOWAREA * windows + DOORAREA * doors));
                paintNeeded =  totalSqFt / coverage;
                System.out.print("\n Painting a room measuring " + length 
                + "ft. by " + height + "ft. by " + width + "ft. will take "
                + paintNeeded + " gallons of paint.");
    }

}
