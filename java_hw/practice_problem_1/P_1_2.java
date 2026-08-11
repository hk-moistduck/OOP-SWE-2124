import java.util.Scanner;

public class P_1_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of ball: ");
        double radius = scanner.nextDouble();

        double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        System.out.print("Volume of ball: " + volume);

        scanner.close();
    }
}
