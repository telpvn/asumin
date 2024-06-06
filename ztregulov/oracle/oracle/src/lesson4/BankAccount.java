package lesson4;

public class BankAccount {
    int id;
    String name;
    double balance;

    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();
        BankAccount yourAccount = new BankAccount();
        BankAccount hisAccount = new BankAccount();

        myAccount.id = 1;
        myAccount.name = "Zaur";
        myAccount.balance = 12.35;

        System.out.println(hisAccount.balance);
    }
}
