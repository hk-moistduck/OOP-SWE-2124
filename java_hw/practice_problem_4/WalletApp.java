class Task01_Wallet{

    public static double deposit(double balance, double amount){
        return balance + amount;
    }

    public static double withdraw(double balance, double amount){
        if(amount <= balance){
            return balance - amount;
        }
        else{
            System.out.println("Insufficient balance");
            return balance;
        }
    }
}

class Wallet{
    // task 02
    private double balance;
    // task 03
    private static int idCounter = 1000;
    private final int id;
    // task 04
    private String lastWithdrawMode;

    // task 03
    public Wallet(){
        this(0.0);
    }

    public Wallet(double initialBalance){
        this.id = ++idCounter;
        this.balance = initialBalance;
        this.lastWithdrawMode = "N/A";
    }

    // task 02 & 04
    public void withdraw(double amount){
        // if(amount <= this.balance){
        //     this.balance -= amount;
        // }
        // else{
        //     System.out.println("Insufficient balance");
        // }
        withdraw(amount, "N/A");
    }

    // task 04
    public void withdraw(double amount, String mode){
        if(amount <= this.balance){
            this.balance -= amount;
            this.lastWithdrawMode = mode;
            System.out.println("Succesfully withdrew $" + amount + " via " + mode);
        }
        else{
            System.out.println("insufficient balance");
        }
    }

    // task 02
    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
        }
    }
    
    public double getBalance(){
        return this.balance;
    }

    // task 03
    public int getId(){
        return this.id;
    }

    // task 04
    public String getLastWithdrawMode(){
        return this.lastWithdrawMode;
    }

    // task 02
    public void info(){
        System.out.println("Wallet ID: " + id + " | Balance: $" + balance + " | Last Mode: " + lastWithdrawMode);
    }

    // task 05
    public static void addBonus(Wallet w, double amount){
        if(amount > 0){
            w.deposit(amount);
        }
    }

    public static void swapWallets(Wallet w1, Wallet w2){
        Wallet temp = w1;
        w1 = w2;
        w2 = temp;
    }
}

public class WalletApp {
    public static void main(String[] args) {
        System.out.println("Task 01");
        double balance_1 = 100.0;
        double balance_2 = 50.0;

        balance_1 = Task01_Wallet.deposit(balance_1, 50.0);
        balance_2 = Task01_Wallet.deposit(balance_2, 20.0);

        System.out.println("Balance 1: $" + balance_1);
        System.out.println("Balance 2: $" + balance_2);

        System.out.println("Task 02 to 05");
        Wallet w1 = new Wallet(500.0);
        Wallet w2 = new Wallet();

        w1.info();
        w2.info();

        w1.withdraw(50.0);
        w1.withdraw(100.0, "ATM");
        w1.withdraw(200.0, "ONLINE");
        w1.info();

        System.out.println("w2 before bonus: $" + w2.getBalance());
        Wallet.addBonus(w2, 50.0);
        System.out.println("w2 after bonus: $" + w2.getBalance());

        System.out.println("before swap:");
        System.out.print("w1: ");
        w1.info();
        System.out.print("w2: ");
        w2.info();

        Wallet.swapWallets(w1, w2);

        System.out.println("after swap:");
        System.out.print("w1: ");
        w1.info();
        System.out.print("w2: ");
        w2.info();

    }
}
