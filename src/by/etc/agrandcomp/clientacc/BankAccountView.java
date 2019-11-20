package by.etc.agrandcomp.clientacc;

public class BankAccountView {

    public void printAcc(BankAccount account) {
        System.out.println("Bank account number: " + account.getAccountNumber() + "\n"
                + "Current amount: " + account.getAmount() + "\n"
                + "Current account status: " + account.isBlocked() + "\n"
                + "***********************************************************");
    }
}
