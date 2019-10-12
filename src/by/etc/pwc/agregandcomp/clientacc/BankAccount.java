package by.etc.pwc.agregandcomp.clientacc;


public class BankAccount implements Comparable<BankAccount> {
    private Integer accountNumber;
    private Double amount;
    private boolean isBlocked;

    public BankAccount(int accountNumber, double amount, boolean isBlocked) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.isBlocked = isBlocked;
    }

    public String toString() {
        return  "Bank account number: "+accountNumber + "\n"
                +"Current amount: "+amount + "\n"
                +"Current account status: "+isBlocked + "\n"
                +"***********************************************************";
    }

    @Override
    public int compareTo(BankAccount o) {
        return this.accountNumber.compareTo(o.accountNumber);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }
}
