
public class YourFirstAccount {

    public static void main(String[] args) {
        Account pedroAccount = new Account("Pedro's account,", 100.00);
        pedroAccount.deposit(20);
        System.out.println(pedroAccount);
        
    }
}
