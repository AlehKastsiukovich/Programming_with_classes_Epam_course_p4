package by.etc.agrandcomp.state;


public class Town {
    private double square;
    private String townName;

    public Town(String townName, double square) {
        this.townName = townName;
        this.square = square;
    }

    public String toString() {
        return townName;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }
}
