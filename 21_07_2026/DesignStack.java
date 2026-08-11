public class DesignStack {
    public static class Stack{
        int[] arr = new int[10];
        int n;

        void push(int num){
            if(n == 10){
                System.out.println("stack full");
                return;
            }
            arr[n++] = num;
            System.out.println(num + " pushed");
            System.out.print("Stack: ");
            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        int pop(){
            if(n == 0){
                System.out.println("stack empty");
                return -1;
            }
            int num = arr[--n];
            System.out.println(num + " popped");
            System.out.print("Stack: ");
            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return num;
        }
    }
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        stack1.push(10);
        stack1.push(20);
        stack1.pop();
        stack1.pop();
        stack1.pop();
    }
}
