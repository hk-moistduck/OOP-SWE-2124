import java.util.Scanner;

public class P_1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celcius: ");
        double celcius = scanner.nextDouble();

        double fahrenheit = (celcius * 9.0 / 5) + 32.0;
        System.out.print("Temperature in Fahrenheit: " + fahrenheit);
        
        scanner.close();
    }
}
