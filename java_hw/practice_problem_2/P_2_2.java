import java.util.Scanner;

public class P_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("for loop:");

        for(int i = 2; i <= 20; i += 2){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 1; i <= 19; i += 2){
            System.out.print(i + " ");
        }

        System.out.println("\n\nwhile loop:");

        int i = 2;
        while(i <= 20){
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();
        i = 1;
        while(i <= 19){
            System.out.print(i + " ");
            i += 2;
        }

        System.out.println("\n\ndo-while loop:");

        i = 2;
        do{
            System.out.print(i + " ");
            i += 2;
        } while(i <= 20);
        System.out.println();
        i = 1;
        do{
            System.out.print(i + " ");
            i += 2;
        } while(i <= 19);

        sc.close();
    }
}
