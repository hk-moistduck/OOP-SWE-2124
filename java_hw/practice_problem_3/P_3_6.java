import java.util.Scanner;

public class P_3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.print("Enter " + n + " elements: ");
        for(int i = 0; i < numbers.length; i++) numbers[i] = sc.nextInt();

        System.out.print("Reversed Series: ");
        for(int i = numbers.length - 1; i >= 0; i--){
            System.out.print(numbers[i] + " ");
        }

        sc.close();
    }
}
