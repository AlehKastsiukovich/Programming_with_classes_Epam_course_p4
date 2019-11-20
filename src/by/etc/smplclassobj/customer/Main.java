package by.etc.smplclassobj.customer;


/**
 * Создать класс Customer. (id, фамилия, имя, отчество, адрес, номер кредитной карты, номер банковского счета).
 * Определить конструкторы, сеттеры и геттеры, toString(). Создать второй класс агрегирующий массив типа
 * Customer c подходящими конструкторами и методами.
 * вывести:
 * -список покупателей в алфавитном порядке.
 * -список покупателей, у которых номер кредитной карты находится в заданном интервале.
 */

public class Main {

    public static void main(String[] args) {
        BankLogic logic = new BankLogic();
        Bank bank = new Bank();

        Customer customer1 = new Customer(1, "Kastsiukovich", "Aleh",
                "Iharavich", +4449, 84449);
        Customer customer2 = new Customer(2, "Efremenko", "Roman",
                "Eduardovich", +6669, 4228);

        logic.addCustomer(bank, customer1);
        logic.addCustomer(bank, customer2);

        BankView view = new BankView();
        view.printAllCustomers(bank);

        logic.sortCustomersByAlph(bank.getCustomers());

        view.printAllCustomers(bank);
    }
}
