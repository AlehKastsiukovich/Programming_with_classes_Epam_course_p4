package by.etc.pwc.simpleclassandobj.customer;

import java.util.Arrays;

public class Bank {
    private Customer[] customers;

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public void sortCustomersByAlph(Customer[] customers) {
        Arrays.sort(this.customers);
        System.out.println("Sort customers by alphabet: \n");
        for(Customer all : customers) {
            System.out.println(all.toString());
            System.out.println("-----------------------");
        }
    }

    public void sortByCreditCardInterval(int a, int b) {
        System.out.println("Find customers by credit card in interval between " + a + "-" + b + ":\n");
        for(Customer all: customers) {
            if(all.getCreditCardNumber() >= a && all.getCreditCardNumber() <= b ) {
                System.out.println(all.toString());
            }
        }
    }

}
