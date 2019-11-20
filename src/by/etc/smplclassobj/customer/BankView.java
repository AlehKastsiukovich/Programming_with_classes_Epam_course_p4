package by.etc.smplclassobj.customer;

public class BankView {

    public void printAllCustomers(Bank bank) {
        for (Customer customer : bank.getCustomers()) {
            System.out.println(customer.toString());
        }
    }
}
