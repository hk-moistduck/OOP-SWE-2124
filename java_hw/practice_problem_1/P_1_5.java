import java.util.Scanner;

public class P_1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter arm of equilateral triangle: ");
        double arm = scanner.nextDouble();

        double area = (Math.sqrt(3) / 4) * Math.pow(arm, 2);
        System.out.print("Area of equilateral triangle: " + area);
        
        scanner.close();
    }
}
