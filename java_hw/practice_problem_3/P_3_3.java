import java.util.Scanner;

public class P_3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter target sales percentage achieved: ");
        double salesPercent = sc.nextDouble();

        System.out.print("Enter attendance percentage: ");
        double attendancePercent = sc.nextDouble();

        int bonusPercentage = 5;

        if(salesPercent >= 95){
            if(attendancePercent == 100) bonusPercentage = 60;
            else if(attendancePercent >= 90) bonusPercentage = 40;
        }
        else if(salesPercent >= 80){
            if(attendancePercent == 100) bonusPercentage = 40;
            else if(attendancePercent >= 90) bonusPercentage = 20;
        }

        System.out.println("Allocated Bonus: " + bonusPercentage + "%");
        sc.close();
    }
}
