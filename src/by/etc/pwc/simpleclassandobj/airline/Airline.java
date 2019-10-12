package by.etc.pwc.simpleclassandobj.airline;


/**
 * Создать класс Airline. Определить конструкторы, сеттеры, геттеры, toString(). Создать второй класс
 * агрегирующий массив типа Airlines с подходящими конструкторами и методами. Задать критерии выбора
 * данных и вывести их на консоль.
 * Airlines - пункт назначения, номер рейса, тип самолета, время вылета, дни недели
 * -Список рейсов для заданного пункта назначения
 * -список рейсов для заданного дня недели
 * -список рейсов для заданного дня недели, время вылета для котрых больше заданного
 */

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

    public static void main(String[] args) {
        Airline airline = new Airline(
                "Minsk",
                1001,
                AirLiner.BOEING_777,
                23.00,
                Days.MONDAY
        );

        Airline airline2 = new Airline(
                "Minsk",
                1005,
                AirLiner.AIRBUS_A340,
                13.00,
                Days.WEDNESDAY
        );

        Airline[] airlines = {airline, airline2};
        Airport airport = new Airport();
        airport.setAirlines(airlines);
        //airport.getListByDestination();
        airport.getListByDayAndTime();
    }
}
