import java.util.Scanner;

public class LabGrade {
    public static void main (String[] args) {
        final double IN_WEIGHT = 0.6;  //in-class weight is 60%
        final double OUT_WEIGHT = 0.4;  //out-of-class weight is 40%
        double preLabPts; //number of points earned on the pre-lab assignment
        double preLabMax; //maximum number of points possible for pre-lab
        double labPts; //number of points earned on the lab
        double labMax; //maximum number of points possible for lab
        double postLabPts; //number of points earned on the post-lab assignment
        double postLabMax; //maximum number of points possible for the post-lab
        double outClassAvg; //average on the out of class (pre and post) work
        double inClassAvg; //average on the in-class work
        double labGrade; //final lab grade
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to the Lab Grade Calculatorn");
        System.out.print("Enter the number of points you earned on the pre-lab ");
        preLabPts = scan.nextInt();
        System.out.print("What was the maximum number of points you could have earned ");
        preLabMax = scan.nextInt();
        System.out.print("Enter the number of points you earned on the lab ");
        labPts = scan.nextInt();
        System.out.print("What was the maximum number of points for the lab ");
        labMax = scan.nextInt();
        System.out.print("Enter the number of points you earned on the post-lab ");
        postLabPts = scan.nextInt();
        System.out.print("What was the maximum number of points for the post-lab ");
        postLabMax = scan.nextInt();
        scan.close();
        System.out.println();
        outClassAvg = (preLabPts + postLabPts) / (preLabMax + postLabMax) * 100;
        inClassAvg = labPts / labMax * 100;
        labGrade = OUT_WEIGHT * outClassAvg + IN_WEIGHT * inClassAvg;
        System.out.println("Your average on out-of-class work is " + outClassAvg + "%");
        System.out.println("Your average on in-class work is "  + inClassAvg + "%");
        System.out.println("Your lab grade is "  + labGrade + "%");
        System.out.println();
        }
}
