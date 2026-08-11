import java.util.Scanner;

public class P_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        double[] numbers = new double[n];
        
        System.out.print("Enter " + n + " elements: ");
        for(int i = 0; i < numbers.length; i++) numbers[i] = sc.nextDouble();
        double total_sum = 0;

        for(int i = 0; i < numbers.length; i++){
            total_sum += numbers[i];
        }

        double average = total_sum / numbers.length;
        System.out.printf("Average: %.2f\n", average);

        sc.close();
    }
}
