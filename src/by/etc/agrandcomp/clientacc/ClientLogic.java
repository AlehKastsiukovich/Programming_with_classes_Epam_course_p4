package by.etc.agrandcomp.clientacc;


import java.util.Collections;
import java.util.List;

public class ClientLogic {

    public void addBankAccount(Client client, BankAccount bankAccount) {
        if (bankAccount != null) {
            client.getList().add(bankAccount);
        }
    }

    public void sortByAccountNumber(List<BankAccount> list) {
        Collections.sort(list);
    }

    public double totalSumOnAllAccounts(Client client) {
        double totalSumm = 0.0;

        for (BankAccount acc : client.getList()) {
            totalSumm += acc.getAmount();
        }

        return totalSumm;
    }

    public BankAccount searchBankAccount(List<BankAccount> list, int search) {
        for (BankAccount acc : list) {

            if (acc.getAccountNumber() == search) {
                return acc;
            }
        }

        return null;
    }

    public double sumOfMinusAcc(List<BankAccount> list) {
        double totSumMinus = 0.0;

        for (BankAccount acc : list) {

            if (acc.getAmount() < 0) {
                totSumMinus += acc.getAmount();
            }
        }

        return totSumMinus;
    }

    public double sumOfPlusAcc(List<BankAccount> list) {
        double totSumPlus = 0.0;

        for (BankAccount acc : list) {

            if (acc.getAmount() >= 0) {
                totSumPlus += acc.getAmount();
            }
        }

        return totSumPlus;
    }
}
