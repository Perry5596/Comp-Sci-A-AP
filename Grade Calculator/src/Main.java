/* Assignment 1 - Calculating Grades */
import java.text.DecimalFormat;
import java.util.Scanner;

class Assignment1
{
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args)
    {

        /* Write your code here */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the course name.");
        String courseName = input.nextLine();
        System.out.println("Please enter the average time spent in a week for this course in minutes.");
        int minutes = input.nextInt();
        System.out.println("Please enter the homework grades for this course.");
        double h1 = input.nextInt();
        double h2 = input.nextInt();
        double h3 = input.nextInt();
        double h4 = input.nextInt();
        System.out.println("Please enter the quiz grades for this course.");
        double q1 = input.nextFloat();
        double q2 = input.nextFloat();
        System.out.println("Please enter the final exam grade for this course.");
        double f = input.nextDouble();

        int hours = minutes/60;
        minutes %= 60;

        double avgH = (h1+h2+h3+h4) / 4;
        double avgQ = (q1+q2) / 2;
        double avgGrade = Math.round((avgH * 0.35) + (avgQ * 0.15) + (f * 0.5));

        System.out.println("Course name: "+courseName);
        System.out.println("Weekly time spent: "+hours+"h"+minutes);
        System.out.println("Average homework grade: "+df.format(avgH));
        System.out.println("Average quiz grade: "+df.format(avgQ));
        System.out.println("Final exam grade: "+df.format(f));
        System.out.println("Overall grade: "+avgGrade);
    }
}
