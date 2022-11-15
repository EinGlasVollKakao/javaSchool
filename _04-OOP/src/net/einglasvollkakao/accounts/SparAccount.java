package net.einglasvollkakao.accounts;

public class SparAccount extends BaseAccount {

    public SparAccount () {
        setInterest(0.05);
    }

    @Override
    public void withdraw(double amount) {
        if (this.getBalance() >= amount) {
            super.withdraw(amount);
            System.out.println("Es wurden " + amount + " von ihrem Konto abgebucht");
        } else {
            System.out.println("zu wenig geld");
        }
    }
}
