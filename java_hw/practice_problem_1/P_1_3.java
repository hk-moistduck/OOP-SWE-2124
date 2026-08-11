import java.util.Scanner;

public class P_1_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);
        System.out.print("Area of circle: " + area);
        
        scanner.close();
    }
}
