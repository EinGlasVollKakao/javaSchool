package net.einglasvollkakao.accounts;

public class GmeinerKredit extends BaseAccount {
    private BaseAccount connectedAcc;
    private double loan;
    private double monthlyPayment;

    public GmeinerKredit(BaseAccount connectedAcc, double loan, double monthlyPayment) {
        this.connectedAcc = connectedAcc;
        this.monthlyPayment = monthlyPayment;
        this.loan = loan;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("not possible");
    }

    public void monthlyPayment() {
        if (loan <= 0) {
            System.out.println("loan bereits abbezahlt");
            return;
        }

        if (connectedAcc.getBalance() < monthlyPayment) {
            System.out.println("zu wenig auf verbundenem account. Bitte kontaktiere deinen Berater.");
            return;
        }

        connectedAcc.withdraw(monthlyPayment);
        this.loan -= monthlyPayment;
        System.out.println("du must nur noch " + this.loan + " abbezahlen");
    }
}
