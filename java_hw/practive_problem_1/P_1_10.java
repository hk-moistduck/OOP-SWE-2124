import java.util.Scanner;

public class P_1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer a: ");
        int a = sc.nextInt();

        System.out.print("Enter integer b: ");
        int b = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char ch = sc.next().charAt(0);

        if(ch == '+') System.out.println("Result: " + (a + b));
        else if(ch == '-') System.out.println("Result: " + (a - b));
        else if(ch == '*') System.out.println("Result: " + (a * b));
        else if(ch == '/'){
            if(b != 0) System.out.println("Result: " + (a / b));
            else System.out.println("can not divide by zero");
        }

        sc.close();
    }
}
