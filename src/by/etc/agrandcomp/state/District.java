package by.etc.agrandcomp.state;


public class District {
    private Town districtCenter;
    private Town [] towns;
    private double square;

    public void districtArea() {
        for(int i = 0; i < towns.length; i++) {
            square += towns[i].getSquare();
        }
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public Town getDistrictCenter() {
        return districtCenter;
    }

    public void setDistrictCenter(Town districtCenter) {
        this.districtCenter = districtCenter;
    }

    public Town[] getTowns() {
        return towns;
    }

    public void setTowns(Town[] towns) {
        this.towns = towns;
    }
}
