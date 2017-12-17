package oop;

/**
 * Created by Lena on 12/16/2017.
 */
public class Bank {
    String title;

    public Bank(String title) {
        this.title = title;
    }

    public class Account{
        private int number;
        private double balance;

        public Account(int number, double balance) {
            this.number = number;
            this.balance = balance;
        }

        public void setMoney(double balance){
            if (balance > 0){
                this.balance+=balance;
            }
        }

        public void getBalance(double balance){
            if(balance <this.balance){
                this.balance-=balance;
            }
        }

        public void show(){
            System.out.printf("Bank - %s, number account - %d, balance - %f%n", title, number, balance);
        }
    }
}

