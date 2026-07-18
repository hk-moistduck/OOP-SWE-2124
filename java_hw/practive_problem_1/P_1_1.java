import java.util.Scanner;

public class P_1_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base of triangle: ");
        float base = scanner.nextFloat();

        System.out.print("Enter height of triangle: ");
        float height = scanner.nextFloat();

        float area = 0.5f * base * height;
        System.out.print("Area of triangle: " + area);
        
        scanner.close();
    }
}
