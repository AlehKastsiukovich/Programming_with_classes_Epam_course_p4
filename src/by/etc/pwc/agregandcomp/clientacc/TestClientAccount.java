package by.etc.pwc.agregandcomp.clientacc;


import java.util.List;

/**
 * Счета. Клиент может иметь несколько счетов. Учитывать возможность блокировки разблокировки счета.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
 * всем счетам, имеющим положительный и отрицательный баланс отдельно.
 */

public class TestClientAccount {
    public static void main(String[] args) {
        Client client = new Client();

        BankAccount bankAccount1 = new BankAccount(1111111,100, true);
        BankAccount bankAccount2 = new BankAccount(2222222,50, true);
        client.addBankAccount(bankAccount1);
        client.addBankAccount(bankAccount2);

        List<BankAccount> list = client.getList();
        //client.sortByAccountNumber(list);
        //client.totalSumOnAllAccounts();
        //client.searchBankAccount(list);
        client.sumOfMinusAmounts(list);
        client.sumOfPlusAmounts(list);
    }
}
