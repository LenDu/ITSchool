package oop;

/**
 * Created by Lena on 12/16/2017.
 */
public class BankMain {
    public static void main(String[] args) {
        Bank privetBank = new Bank("PrivetBank");
        Bank monoBank = new Bank("MonoBank");
        Bank.Account account = privetBank.new Account(123, 24.5);
        Bank.Account account1 = monoBank.new Account(345, 26.5);

        account.show();
        account1.show();
        account1.setMoney(150);
        account1.show();
        account.getBalance(20);
        account.show();


    }
}
