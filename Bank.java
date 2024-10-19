public class Bank {

    public static void main(String[] args) {
        Account sena = new Account("3322", 50000);

        sena.Depost(10000);
        sena.Withdraw(2000);
        
        System.out.println(sena.Getaccount_Num());
        System.out.println( sena.Getbalance());
        System.out.println( Account.bank_Name);

    }
    
}
