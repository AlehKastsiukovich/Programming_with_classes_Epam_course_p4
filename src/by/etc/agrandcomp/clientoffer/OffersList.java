package by.etc.agrandcomp.clientoffer;


import java.util.ArrayList;
import java.util.List;

public class OffersList {
    List<TravelVoucher> list = new ArrayList<>();

    public OffersList() {

    }

    public OffersList(List<TravelVoucher> list) {
        this.list = list;
    }

    public List<TravelVoucher> getList() {
        return list;
    }

    public void setList(List<TravelVoucher> list) {
        this.list = list;
    }
}
