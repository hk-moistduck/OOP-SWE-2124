public class P_3_8 {
    public static void main(String[] args) {
        int t1 = 0;
        int t2 = 1;

        System.out.print(t1 + ", " + t2);

        int nextTerm = t1 + t2;

        while(nextTerm <= 89){
            System.out.print(", " + nextTerm);
            t1 = t2;
            t2 = nextTerm;
            nextTerm = t1 + t2;
        }
        System.out.println();
    }
}
