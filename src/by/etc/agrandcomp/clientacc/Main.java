package by.etc.agrandcomp.clientacc;


/**
 * Счета. Клиент может иметь несколько счетов. Учитывать возможность блокировки разблокировки счета.
 * Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
 * всем счетам, имеющим положительный и отрицательный баланс отдельно.
 */

public class Main {

    public static void main(String[] args) {
        Client client = new Client("Aleh");
        ClientLogic logic = new ClientLogic();
        BankAccountView view = new BankAccountView();

        BankAccount bankAccount1 = new BankAccount(9999999,100, true);
        BankAccount bankAccount2 = new BankAccount(2222222,50, true);
        BankAccount bankAccount3 = new BankAccount(3333333,-99, true);
        BankAccount bankAccount4 = new BankAccount(1111111,-5, true);

        logic.addBankAccount(client, bankAccount1);
        logic.addBankAccount(client, bankAccount2);
        logic.addBankAccount(client, bankAccount3);
        logic.addBankAccount(client, bankAccount4);

        for (BankAccount account: client.getList()) {
            view.printAcc(account);
        }

        logic.sortByAccountNumber(client.getList());

        double sum = logic.totalSumOnAllAccounts(client);

        System.out.println("Total sum on all account: " + sum);
    }
}
