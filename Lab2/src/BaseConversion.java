import java.util.Scanner;
/**
 * Converts from base 10 to base x.
 * @author Alex
 * @version 9001
 */
public class BaseConversion {
    /**
     * Main of program.
     * @param args unused
     */
    public static void main(String[] args) {
        int base;
        int base10Num;
        int maxNum;
        
        int place0;
        int place1;
        int place2;
        int place3;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println();
        System.out.println("Base Conversion Program");
        System.out.println();
        System.out.println("Please enter a base (2-9): ");
        base = scan.nextInt();
        maxNum = base * base * base * base - 1;
        System.out.println("Please enter a base 10 number (1-" + maxNum + ": ");
        base10Num = scan.nextInt();
        scan.close();
        place0 = base10Num % base;
        base10Num = base10Num / base;
        place1 = base10Num % base;
        base10Num = base10Num / base;
        place2 = base10Num % base;
        base10Num = base10Num / base;
        place3 = base10Num % base;
        System.out.println("The number in base " + base + " is " 
                + place3 + place2 + place1 + place0);
    }

}
