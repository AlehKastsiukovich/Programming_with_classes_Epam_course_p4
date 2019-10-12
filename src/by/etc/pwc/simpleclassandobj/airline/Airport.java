package by.etc.pwc.simpleclassandobj.airline;


import java.util.Scanner;

public class Airport {
    private Airline[] airlines;

    public Airline[] getAirlines() {
        return airlines;
    }

    public void setAirlines(Airline[] airlines) {
        this.airlines = airlines;
    }

    public void getListByDestination() {
        Scanner scanner = new Scanner(System.in);
        String destination = null;

        System.out.println("Enter your destination: ");
        destination = scanner.nextLine();

        for (Airline sort : airlines) {
            if (sort.getDestination().equalsIgnoreCase(destination)) {
                System.out.println(sort.toString());
            }
        }
    }

    public void getListByDay() {
        String day = null;
        Scanner scanner = new Scanner(System.in);

        Days[] days = Days.values();
        for(Days d: days) {
            System.out.println(d.toString());
        }

        System.out.println("Choose a day of the week. Follow the example: ");
        day = scanner.nextLine();

        for(Airline air: airlines) {
            if(air.getDay() == Days.valueOf(day)) {
                System.out.println(air.toString());
            } else {
                System.out.println("No more flight this day");
            }
        }
    }

    public void getListByDayAndTime() {
        String day = null;
        double time;
        Scanner scanner = null;

        Days[] days = Days.values();
        System.out.println("Days: ");
        for(Days d: days) {
            System.out.println(d.toString());
        }

        scanner = new Scanner(System.in);
        System.out.println("Choose a day of the week. Follow the example: ");
        day = scanner.nextLine();
        System.out.println("Choose time: ");
        time = scanner.nextDouble();

        for(Airline air: airlines) {
            if((air.getDay() == Days.valueOf(day)) && (air.getDepartureTime() > time)) {
                System.out.println(air.toString());
            } else {
                System.out.println("No flight this day or input is incorrect");
            }
        }
    }
}
