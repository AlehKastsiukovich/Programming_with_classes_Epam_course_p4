package by.etc.pwc.agregandcomp.state;

public class Region {
    private Town RegionCenter;
    private District [] districts;
    private double square;

    public void calculateSquare() {
        for(int i = 0; i < districts.length; i++) {
            square += districts[i].getSquare();
        }
    }

    public Region(Town regionCenter) {
        RegionCenter = regionCenter;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public Town getRegionCenter() {
        return RegionCenter;
    }

    public void setRegionCenter(Town regionCenter) {
        RegionCenter = regionCenter;
    }

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }
}
