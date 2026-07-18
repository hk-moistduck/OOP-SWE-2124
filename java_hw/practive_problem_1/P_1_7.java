import java.util.Scanner;

public class P_1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if(n > 0) System.out.print(n + " is positive");
        else System.out.print(n + " is negative");

        sc.close();
    }
}
