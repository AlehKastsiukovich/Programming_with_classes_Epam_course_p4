package by.etc.agrandcomp.clientoffer;


import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OfferListLogic {

    public void sortByCountryName(List<TravelVoucher> list) {
        Collections.sort(list);
    }

    public TravelVoucher chooseOffer(OffersList list) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int num;

        for (int i = 0; i < list.getList().size(); i++) {
            System.out.println("Number of voucher: " + i);
            new TravelVoucherView().printVoucher(list.getList().get(i));
        }

        System.out.println("Choose number of travel voucher: ");
        while (true) {
            num = scanner.nextInt();

            if (num < list.getList().size()) {
                break;
            }
        }

        return list.getList().get(num);
    }

    public void addVoucher(OffersList list, TravelVoucher travelVoucher) {
        list.getList().add(travelVoucher);
    }
}
