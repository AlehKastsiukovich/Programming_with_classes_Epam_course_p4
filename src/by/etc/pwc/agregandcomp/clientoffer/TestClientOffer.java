package by.etc.pwc.agregandcomp.clientoffer;

/**
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа(отдых, экскурсия, лечение, шоппинг, круиз и т.д) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class TestClientOffer {
    public static void main(String[] args) {
        OffersList offersList = new OffersList();
        offersList.addVoucher(TravelVoucher.createVoucher());
        offersList.addVoucher(TravelVoucher.createVoucher());
        //offersList.showList();
        System.out.println(offersList.chooseOffer().toString());
    }
}
