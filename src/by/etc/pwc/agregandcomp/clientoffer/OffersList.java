package by.etc.pwc.agregandcomp.clientoffer;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OffersList {
    List<TravelVoucher> list = new ArrayList<>();

    public void sortByCountryName(List <TravelVoucher> list) {
        Collections.sort(list);
        for (TravelVoucher tv : list) {
            System.out.println(tv.toString());
        }
    }

    public TravelVoucher chooseOffer() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " - " + list.get(i).toString());
        }

        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Choose number of travel voucher: ");
        while (true) {
            num = scanner.nextInt();

            if (num < list.size()) {
                break;
            }
        }

        System.out.println("You choose is ");
        return list.get(num);
    }

    public void showList() {
        for (TravelVoucher tv : list) {
            System.out.println(tv.toString());
        }
    }

    public void addVoucher(TravelVoucher travelVoucher) {
        list.add(travelVoucher);
    }

    public List<TravelVoucher> getList() {
        return list;
    }

    public void setList(List<TravelVoucher> list) {
        this.list = list;
    }
}
