package by.etc.agrandcomp.clientoffer;


public class TravelVoucherView {

    public void printVoucher(TravelVoucher voucher) {
        System.out.println("Destination country: " + voucher.getCountry() + "\n"
                + "Type of travel voucher: " + voucher.getTypeOfVouchers() + "\n"
                + "Transport: " + voucher.getTransport() + "\n"
                + "Type of nutrition: " + voucher.getNutrition() + "\n"
                + "Days number: " + voucher.getNumberOfDays() + "\n"
                + "***********************************************************");
    }
}
