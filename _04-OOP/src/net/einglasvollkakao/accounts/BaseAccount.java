package net.einglasvollkakao.accounts;

public class BaseAccount {
    private double balance = 0;
    private double interest;

    public double getBalance() {
        return balance;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void giveInterest() {
        double interestYouEarn = this.balance * this.interest;
        this.balance += interestYouEarn;
        System.out.println("Sie haben " + interestYouEarn + "Zinsen erhalten");
    }
}
