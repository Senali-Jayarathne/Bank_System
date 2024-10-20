public class Bank {

    public static void main(String[] args) {
        Account sena = new Account("3322", 50000);

        sena.Depost(10000);
        sena.Withdraw(2000);

        System.out.println("Bank Name: " + Account.bank_Name);
        System.out.println("Account Name: " + Account.acc_Name);
        System.out.println("Account Number: " + sena.Getaccount_Num());
        System.out.println("Balance: " + "LKR " + sena.Getbalance());

    }

}
