package by.etc.agrandcomp.clientacc;


import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private List<BankAccount> list = new ArrayList<BankAccount>();

    public Client(String name) {
        this.name = name;
    }

    public List<BankAccount> getList() {
        return list;
    }

    public String getName() {
        return name;
    }

    public void setList(List<BankAccount> list) {
        this.list = list;
    }

    public void setName(String name) {
        this.name = name;
    }
}
