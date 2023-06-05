package ssg.encapsulation;

public class BankAccount {
//Task 1: Create a BankAccount class with 3 attributes acc no, balance, and owner name.
// Class should be read only.
//Also create public methods deposit and withdraw to update the account balance.
// Implement the class to show controlled access through encapsulation.

    private int accountNo;
    private double balance;
    private String ownerName;

    public void deposit(double depositAmount){
       balance = balance+depositAmount;
    }

    public double withdraw(double withdrawnAmount){
        if (withdrawnAmount<balance){
        balance = balance-withdrawnAmount;
        } else {
            System.out.println("You do not have enough money");
        }
        return balance;
    }

    public BankAccount(int accountNo, double balance, String ownerName) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
