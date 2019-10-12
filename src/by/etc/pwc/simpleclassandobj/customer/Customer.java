package by.etc.pwc.simpleclassandobj.customer;


/**
 * Создать класс Customer. (id, фамилия, имя, отчество, адрес, номер кредитной карты, номер банковского счета).
 * Определить конструкторы, сеттеры и геттеры, toString(). Создать второй класс агрегирующий массив типа
 * Customer c подходящими конструкторами и методами.
 * вывести:
 * -список покупателей в алфавитном порядке.
 * -список покупателей, у которых номер кредитной карты находится в заданном интервале.
 */

import java.util.ArrayList;
import java.util.List;

public class Customer implements Comparable<Customer> {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private int creditCardNumber;
    private int bankAccount;

    public Customer(int id, String surname, String name, String patronymic, int creditCardNumber, int bankAccount) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.creditCardNumber = creditCardNumber;
        this.bankAccount = bankAccount;
    }

    public String toString() {
        return    "Client id: " + id + "\n"
                + "Surname: " + surname + "\n"
                + "Name: " + name + "\n"
                + "Patronymic: " + patronymic + "\n"
                + "Credit card number: " + creditCardNumber + "\n"
                + "Bank Account: " + bankAccount;
    }

    public int compareTo(Customer o) {
        int result = this.getSurname().compareTo(o.getSurname());

        if (result == 0) {
            result = this.getName().compareTo(o.getName());
        }

        if (result == 0) {
            result = this.getPatronymic().compareTo(o.getPatronymic());
        }

        return result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        Customer customer1 = new Customer(1, "Kastsiukovich", "Aleh",
                "Iharavich",+ 4449, 84449);

        Customer customer2 = new Customer(2, "Efremenko","Roman",
                "Eduardovich", + 6669, 4228);

        customerList.add(customer1);
        customerList.add(customer2);

        Customer[] array = customerList.toArray(new Customer[0]);

        Bank bank = new Bank();
        bank.setCustomers(array);

        bank.sortCustomersByAlph(array);

        bank.sortByCreditCardInterval(0,5000);
    }
}
