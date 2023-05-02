/* Assignment 2 - Control Tower */
/* Class name - must be "Assignment2" in order to run */
import java.util.Scanner;
import assignment2.Airplane;

public class Assignment2
{

    public static void main(String[] args)
    {
        /* Write your code here */
        Scanner scan = new Scanner(System.in);
        String a;

        double b;

        int c;
        int d;




        System.out.println("Enter the details of the third airplane (call-sign, distance, bearing and altitude):");
        a = scan.nextLine();
        b = scan.nextDouble();
        c = scan.nextInt();
        d = scan.nextInt();
        a = a.toUpperCase();
        System.out.println("Initial Positions:");
        Airplane p1 = new Airplane();
        System.out.println("\"Airplane 1\"" + ": " + p1);
        Airplane p2 = new Airplane("AAA02",15.8,128,30000);
        System.out.println("\"Airplane 2\"" + ": " +p2);
        Airplane p3 = new Airplane(a,b,c,d);
        System.out.println("\"Airplane 3\"" + ": " +p3);

        double e=p1.distTo(p2);
        double f=p1.distTo(p3);
        double g=p2.distTo(p3);

        System.out.println("");
        System.out.println("Initial Distances:");
        System.out.println("The distance between Airplane 1 and Airplane 2 is "+ e + " miles.");
        System.out.println("The distance between Airplane 1 and Airplane 3 is "+ f + " miles.");
        System.out.println("The distance between Airplane 2 and Airplane 3 is "+ g + " miles.");

        int h = p1.getAlt();
        int i = p2.getAlt();
        int j = p3.getAlt();

        int k = Math.abs(h-i);
        int l = Math.abs(h-j);
        int m = Math.abs(i-j);

        System.out.println("");
        System.out.println("Initial Height Differences:");
        System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + k + " feet.");
        System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + l + " feet.");
        System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + m + " feet.");

        p1.gainAlt();
        p1.gainAlt();
        p1.gainAlt();

        p2.loseAlt();
        p2.loseAlt();

        p3.loseAlt();
        p3.loseAlt();
        p3.loseAlt();
        p3.loseAlt();

        p1.move(g,65);
        p2.move(8,135);
        p3.move(5,55);
        System.out.println("");
        System.out.println("New Positions: ");
        System.out.println("\"Airplane 1\"" + ": " +p1);
        System.out.println("\"Airplane 2\"" + ": " +p2);
        System.out.println("\"Airplane 3\"" + ": " +p3);



        double ee=p1.distTo(p2);
        double ff=p1.distTo(p3);
        double gg=p2.distTo(p3);

        System.out.println("");
        System.out.println("New Distances:");
        System.out.println("The distance between Airplane 1 and Airplane 2 is "+ ee + " miles.");
        System.out.println("The distance between Airplane 1 and Airplane 3 is "+ ff + " miles.");
        System.out.println("The distance between Airplane 2 and Airplane 3 is "+ gg + " miles.");


        int hh = p1.getAlt();
        int ii = p2.getAlt();
        int jj = p3.getAlt();

        int kk = Math.abs(hh-ii);
        int ll = Math.abs(hh-jj);
        int mm = Math.abs(ii-jj);

        System.out.println("");
        System.out.println("New Height Differences:");
        System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + kk+ " feet.");
        System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + ll+ " feet.");
        System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + mm+ " feet.");


    }
}