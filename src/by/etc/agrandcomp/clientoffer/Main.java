package by.etc.agrandcomp.clientoffer;


/**
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа(отдых, экскурсия, лечение, шоппинг, круиз и т.д) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Main {

    public static void main(String[] args) {
        OffersList offersList = new OffersList();
        OfferListLogic logic = new OfferListLogic();
        TravelVoucherView view = new TravelVoucherView();

        TravelVoucher voucher1 = new TravelVoucher();
        voucher1.setCountry("USA");
        voucher1.setNumberOfDays(30);
        voucher1.setNutrition(Nutrition.WITHOUT);
        voucher1.setTransport(Transport.AIR);
        voucher1.setTypeOfVouchers(TypeOfVouchers.EXCURSION);

        TravelVoucher voucher2 = new TravelVoucher();
        voucher2.setCountry("Canada");
        voucher2.setNumberOfDays(23);
        voucher2.setNutrition(Nutrition.WITHOUT);
        voucher2.setTransport(Transport.AIR);
        voucher2.setTypeOfVouchers(TypeOfVouchers.EXCURSION);

        TravelVoucher voucher3 = new TravelVoucher();
        voucher3.setCountry("Poland");
        voucher3.setNumberOfDays(7);
        voucher3.setNutrition(Nutrition.BREAKFASTONLY);
        voucher3.setTransport(Transport.BUS);
        voucher3.setTypeOfVouchers(TypeOfVouchers.SHOPPING);

        logic.addVoucher(offersList, voucher1);
        logic.addVoucher(offersList, voucher2);
        logic.addVoucher(offersList, voucher3);

        TravelVoucher choose = logic.chooseOffer(offersList);

        System.out.println("Your choose is : ");
        view.printVoucher(choose);
    }
}
