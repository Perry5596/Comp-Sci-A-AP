import java.util.Scanner;

class GradeCalculator  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Course Name: ");
        String courseName = scanner.nextLine();

        System.out.print("Time in minutes spent in week: ");
        int time = scanner.nextInt();

        System.out.println("Enter all homework grades below: ");
        float homeworkOne = scanner.nextFloat();
        float homeworkTwo = scanner.nextFloat();
        float homeworkThree = scanner.nextFloat();
        float homeworkFour = scanner.nextFloat();

        System.out.println("Enter all quiz grades below: ");
        float quizOne = scanner.nextFloat();
        float quizTwo = scanner.nextFloat();

        System.out.print("Enter your final exam grade: ");
        float finalExam = scanner.nextFloat();


        int hours = time / 60;
        int minutes = time % 60;

        float homeworkAverage = (homeworkOne + homeworkTwo + homeworkThree + homeworkFour) / 4;
        float quizAverage = (quizOne + quizTwo) / 2;

        float finalAverage = (float)(homeworkAverage * 0.35) + (float)(quizAverage * 0.15) + (float)(finalExam * 0.5);


        System.out.println("Course name: " + courseName);
        System.out.println("Time spent: " + hours + "h " + minutes + "m");
        System.out.println("Average homework grade: " + homeworkAverage);
        System.out.println("Average quiz grade: " + quizAverage);
        System.out.println("Final exam grade: " + finalExam);
        System.out.println("Course average grade: " + finalAverage);
    }
}