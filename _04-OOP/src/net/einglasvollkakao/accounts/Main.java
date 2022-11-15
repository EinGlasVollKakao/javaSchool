package net.einglasvollkakao.accounts;

public class Main {
    public static void main(String[] args) {
        GiroAccount giro = new GiroAccount(100, 200);
        SparAccount sparen = new SparAccount();
        GmeinerKredit kredit = new GmeinerKredit(giro, 1000,100);

        giro.deposit(1000);
        giro.withdraw(1200);
        giro.withdraw(100);
        
        sparen.deposit(100);
        sparen.giveInterest();
        System.out.println(sparen.getBalance());

        kredit.monthlyPayment();
        System.out.println(giro.getBalance());
    }
}
