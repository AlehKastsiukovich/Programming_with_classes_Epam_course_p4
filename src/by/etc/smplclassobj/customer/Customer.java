package by.etc.smplclassobj.customer;


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
        return "Client id: " + id + "\n"
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
}
