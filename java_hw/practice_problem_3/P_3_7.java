import java.util.Scanner;

public class P_3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for(int i = 0; i < numbers.length; i++) numbers[i] = sc.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        for(int num : numbers){
            if(num % 2 == 0) evenCount++;
            else oddCount++;
        }
        
        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);

        sc.close();
    }
}
