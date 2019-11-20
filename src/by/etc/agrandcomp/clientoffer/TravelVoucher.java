package by.etc.agrandcomp.clientoffer;


public class TravelVoucher implements Comparable<TravelVoucher>{
    private String country;
    private TypeOfVouchers typeOfVouchers;
    private Transport transport;
    private Nutrition nutrition;
    private Integer numberOfDays;

    public TravelVoucher() {

    }

    public TravelVoucher(String country, TypeOfVouchers typeOfVouchers, Transport transport,
                         Nutrition nutrition, Integer numberOfDays) {
        this.country = country;
        this.typeOfVouchers = typeOfVouchers;
        this.transport = transport;
        this.nutrition = nutrition;
        this.numberOfDays = numberOfDays;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public TypeOfVouchers getTypeOfVouchers() {
        return typeOfVouchers;
    }

    public void setTypeOfVouchers(TypeOfVouchers typeOfVouchers) {
        this.typeOfVouchers = typeOfVouchers;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Nutrition getNutrition() {
        return nutrition;
    }

    public void setNutrition(Nutrition nutrition) {
        this.nutrition = nutrition;
    }

    public Integer getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(Integer numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    @Override
    public int compareTo(TravelVoucher o) {
        int result = this.getCountry().compareTo(o.getCountry());

        if (result == 0) {
            result = this.getNumberOfDays().compareTo(o.getNumberOfDays());
        }

        return result;
    }

    public String toString() {
        return "Destination country: " + country + "\n"
                + "Type of travel voucher: " + typeOfVouchers + "\n"
                + "Transport: " + transport + "\n"
                + "Type of nutrition: " + nutrition + "\n"
                + "Days number: " + numberOfDays + "\n"
                + "***********************************************************";
    }
}
