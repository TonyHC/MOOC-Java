
public class YourFirstAccount {

    public static void main(String[] args) {
        Account account1 = new Account("Thomas", 100.0);
        account1.deposit(20.0);
        System.out.println(account1);
    }
}
