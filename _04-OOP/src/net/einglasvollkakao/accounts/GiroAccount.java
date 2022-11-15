package net.einglasvollkakao.accounts;

public class GiroAccount extends BaseAccount{
    private double withdrawLimit;
    private double negativeLimit;

    public GiroAccount(double withdrawLimit, double negativeLimit) {
        this.withdrawLimit = withdrawLimit;
        this.negativeLimit = negativeLimit;
        setInterest(0.02);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > withdrawLimit) {
            System.out.println("Du kannst nicht soviel abheben");
            return;
        }
        if (negativeLimit >= getBalance() - amount) {
            System.out.println("Du kannst nicht so viel ins Minus gehen");
            return;
        }
        super.withdraw(amount);
    }
}
