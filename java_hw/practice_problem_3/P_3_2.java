import java.util.Scanner;

public class P_3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Has the student completed the semester? (true/false): ");
        boolean isSemesterCompleted = sc.nextBoolean();

        System.out.print("Enter student CGPA/Grade Value: ");
        double letterGrade = sc.nextDouble();

        if(isSemesterCompleted){
            if(letterGrade >= 3.5) System.out.println("Congratulations! The student receives a medal.");
            else System.out.println("Semester complete, but grade criteria not met for a medal.");
        }
        else System.out.println("Ineligible for award: Semester requirements incomplete.");

        sc.close();
    }
}
