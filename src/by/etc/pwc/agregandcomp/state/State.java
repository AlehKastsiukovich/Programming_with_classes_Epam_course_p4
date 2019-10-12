package by.etc.pwc.agregandcomp.state;

public class State {
    private Town capital;
    private Region [] regions;
    private double square;

    public void calculateSquare() {
        for(int i = 0; i < regions.length; i++) {
            square += regions[i].getRegionCenter().getSquare();
        }
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public Town getCapital() {
        return capital;
    }

    public void setCapital(Town capital) {
        this.capital = capital;
    }

    public Region[] getRegions() {
        return regions;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }
}
