package by.etc.smplclassobj.airline;

public class AirPortView {

    public void printAirline(Airline airline) {
        System.out.println("Destination: " + airline.getDestination() + "\n"
                + "Flight number: " + airline.getFlightNum() + "\n"
                + "Airliner: " + airline.getAirLiner() + "\n"
                + String.format("Departure time: %.2f", airline.getDepartureTime()) + "\n"
                + "Day of flights: " + airline.getDay() + "\n"
                + "-----------------------------------------------------------");
    }
}
