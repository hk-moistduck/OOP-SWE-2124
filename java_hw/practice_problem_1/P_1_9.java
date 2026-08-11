import java.util.Scanner;

public class P_1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks: ");
        int marks = sc.nextInt();

        String grade;
        if(marks >= 90) grade = "A+";
        else if(marks >= 80) grade = "A";
        else if(marks >= 70) grade = "A-";
        else if(marks >= 60) grade = "B";
        else if(marks >= 40) grade = "C+";
        else grade = "F";
        
        System.out.print("Grade: " + grade);

        sc.close();
    }
}
