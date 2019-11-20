package by.etc.smplclassobj.airline;


public class Airline {
    private String destination;
    private int flightNum;
    private AirLiner airLiner;
    private double departureTime;
    private Days day;

    public Airline(String destination, int flightNum, AirLiner airLiner, double departureTime, Days day) {
        this.destination = destination;
        this.flightNum = flightNum;
        this.airLiner = airLiner;
        this.departureTime = departureTime;
        this.day = day;
    }

    public String toString() {
        return    "Destination: " + destination + "\n"
                + "Flight number: " + flightNum + "\n"
                + "Airliner: " + airLiner + "\n"
                + String.format("Departure time: %.2f", departureTime) +"\n"
                + "Day of flights: " + day + "\n"
                +"-----------------------------------------------------------";
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(int flightNum) {
        this.flightNum = flightNum;
    }

    public AirLiner getAirLiner() {
        return airLiner;
    }

    public void setAirLiner(AirLiner airLiner) {
        this.airLiner = airLiner;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    public Days getDay() {
        return day;
    }

    public void setDay(Days day) {
        this.day = day;
    }
}
