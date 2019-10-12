package by.etc.pwc.agregandcomp.clientacc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Client {
    private List<BankAccount> list;

    public List<BankAccount> getList() {
        return list;
    }

    public void setList(List<BankAccount> list) {
        this.list = list;
    }

    public Client() {
        list = new ArrayList<>();
    }

    public void addBankAccount(BankAccount bankAccount) {
        if(bankAccount != null) {
            list.add(bankAccount);
        }
    }

    public void sortByAccountNumber(List<BankAccount> list) {
        Collections.sort(list);

        for(BankAccount ba: list) {
            System.out.println(ba.toString());
        }
    }

    public void totalSumOnAllAccounts() {
        double totalSumm = 0.0;
        for(BankAccount ba: list) {
            totalSumm += ba.getAmount();
        }
        System.out.println("Total sum on all accounts = "+totalSumm);
    }

    public void searchBankAccount(List<BankAccount> list) {
        Scanner scanner = new Scanner(System.in);
        int accNum;
        System.out.println("Enter account number: ");
        accNum = scanner.nextInt();

        for (BankAccount ba : list) {
            if (ba.getAccountNumber() == accNum) {
                System.out.println(ba.toString());
            }
        }
    }

    public void sumOfMinusAmounts(List<BankAccount> list) {
        double totSumMinus = 0.0;

        for (BankAccount ba : list) {
            if (ba.getAmount() < 0) {
                totSumMinus += ba.getAmount();
            }
        }
        System.out.println("Total sum of minus amount accounts = " + totSumMinus);
    }

    public void sumOfPlusAmounts(List<BankAccount> list) {
        double totSumPlus = 0.0;

        for(BankAccount ba: list) {
            if(ba.getAmount() >= 0) {
                totSumPlus += ba.getAmount();
            }
        }
        System.out.println("Total sum of plus amount accounts = "+totSumPlus);
    }
}
