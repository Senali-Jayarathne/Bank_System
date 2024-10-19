public class Account {

    private double balance;
    private String account_Num;
    public static String bank_Name = "BOC";

    public Account(String account_Num) {

        balance = 0;
        this.account_Num = account_Num;

    }

    public Account(String account_Num, double balance) {

        this.balance = balance;
        this.account_Num = account_Num;

    }

    public void Withdraw(double amount) {
        balance -= amount;

    }

    public void Depost(double amount) {
        balance += amount;

    }

    public double Getbalance() {
        return balance;

    }

    public String Getaccount_Num() {

        return account_Num;

    }

    public void Close() {
        balance = 0;
    }

}
