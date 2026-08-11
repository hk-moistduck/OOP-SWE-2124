public class WalletApp {
    public static class Wallet{
        private double balance;
        private final int id;
        private static int id_counter = 1000;
        private String last_withdraw_mode;

        public Wallet(double balance){
            this.balance = balance;
            this.id = ++id_counter;
        }

        public Wallet(){
            this(0.0f);
        }

        public void deposit(double amount){
            if(amount > 0) this.balance += amount;
            else System.out.println("Invalid amount for Wallet ID" + this.id);
        }

        public void withdraw(double amount, String mode){
            if(amount > 0 && amount <= this.balance){
                this.balance -= amount;
                this.last_withdraw_mode = mode;
            }
            else System.out.println("Insufficient funds for Wallet ID " + this.id);
        }

        public void withdraw(double amount){
            withdraw(amount, "N/A");
        }

        public static void addBonus(Wallet w, double amount){
            if(w != null && amount > 0) w.deposit(amount);
            else System.out.println("Invalid amount or Wallet doesn't exist");
        }

        public static void swapRef(Wallet w1, Wallet w2){
            Wallet temp;
            temp = w1;
            w1 = w2;
            w2 = temp;
        }

        public void getWalletBalance(){
            System.out.println("Balance: " + balance);
        }

        public void getWalletInfo(){
            System.out.println("ID: " + id + ", Balance: " + balance);
        }

        public void getLastWithdrawMode(){
            System.out.println("Last Withdraw Mode: " + last_withdraw_mode);
        }
    }

    public static void main(String[] args) {
       Wallet w1 = new Wallet();
       Wallet w2 = new Wallet(500);

       w1.getWalletInfo();
       w2.getWalletInfo();

       w2.withdraw(100);
       w2.getLastWithdrawMode();

       w2.withdraw(200, "ATM");
       w2.getLastWithdrawMode();

       Wallet.addBonus(w1, 500);
       w1.getWalletInfo();
       w2.getWalletInfo();

       Wallet.swapRef(w1, w2);
       w1.getWalletInfo();
       w2.getWalletInfo();
    }
}
