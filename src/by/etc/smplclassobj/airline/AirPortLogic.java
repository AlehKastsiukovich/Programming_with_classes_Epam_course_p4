package by.etc.smplclassobj.airline;

import java.util.ArrayList;
import java.util.List;

public class AirPortLogic {

    public void addAirline(Airport airport, Airline airline) {
        if ((airport != null) && (airline != null)) {
            for (int i = 0; i < airport.getAirlines().length; i++) {

                if ((airport.getAirlines()[i] == null)) {
                    airport.getAirlines()[i] = airline;
                    break;
                }
            }
        }
    }

    public List<Airline> getListByDestination(Airport airport, String destination) {
        List<Airline> airlines = new ArrayList<Airline>();

        for (Airline airline : airport.getAirlines()) {
            if (airline != null) {
                if (airline.getDestination().equalsIgnoreCase(destination)) {
                    airlines.add(airline);
                }
            }
        }
        return airlines;
    }

    public List<Airline> getListByDay(Airport airport, Days day) {
        List<Airline> airlines = new ArrayList<Airline>();

        for (Airline airline : airport.getAirlines()) {

            if (airline.getDay() == day) {
                airlines.add(airline);
            }
        }
        return airlines;
    }

    public List<Airline> getListByDayAndTime(Airport airport, Days day, double depTime) {
        List<Airline> airlines = new ArrayList<Airline>();

        for (Airline airline : airport.getAirlines()) {

            if ((airline.getDay() == day) && (airline.getDepartureTime() > depTime)) {
                airlines.add(airline);
            }
        }
        return airlines;
    }
}
