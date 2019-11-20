package by.etc.smplclassobj.airline;


public class Airport {
    private String name;
    private Airline[] airlines = new Airline[30];

    public Airport(String name) {
        this.name = name;
    }

    public Airline[] getAirlines() {
        return airlines;
    }

    public void setAirlines(Airline[] airlines) {
        this.airlines = airlines;
    }
}
