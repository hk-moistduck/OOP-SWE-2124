import java.util.Scanner;;

public class P_3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.print("Enter " + n + " elements");
        for(int i = 0; i < numbers.length; i++) numbers[i] = sc.nextInt();

        int max = numbers[0];

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > max) max = numbers[i];
        }

        System.out.println("The greatest number is: " + max);

        sc.close();
    }
}
