package by.etc.smplclassobj.customer;


import java.util.Collections;
import java.util.List;

public class BankLogic {

    public void sortCustomersByAlph(List<Customer> customers) {
        System.out.println("Sort customers by alphabet: \n");
        Collections.sort(customers);
    }

    public void sortByCreditCardInterval(List<Customer> customers, int a, int b) {
        System.out.println("Find customers by credit card in interval between " + a + "-" + b + ":\n");
        for (Customer all : customers) {
            if (all.getCreditCardNumber() >= a && all.getCreditCardNumber() <= b) {
                System.out.println(all.toString());
            }
        }
    }

    public void addCustomer(Bank bank, Customer customer) {
        bank.getCustomers().add(customer);
    }
}
