import java.util.Scanner;

public class P_1_8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if(n % 2 == 0) System.out.print(n + " is even");
        else System.out.print(n + " is odd");

        sc.close();
    }
}
