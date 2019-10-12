package by.etc.pwc.agregandcomp.clientoffer;


import java.util.Scanner;

public class TravelVoucher implements Comparable<TravelVoucher>{
    private String country;
    private TypeOfVouchers typeOfVouchers;
    private Transport transport;
    private Nutrition nutrition;
    private Integer numberOfDays;
    private static Scanner scanner = new Scanner(System.in);

    public String toString() {
        return "Destination country: " + country + "\n"
                + "Type of travel voucher: " + typeOfVouchers + "\n"
                + "Transport: " + transport + "\n"
                + "Type of nutrition: " + nutrition + "\n"
                + "Days number: " + numberOfDays + "\n"
                + "***********************************************************";
    }

    @Override
    public int compareTo(TravelVoucher o) {
        int result = this.getCountry().compareTo(o.getCountry());

        if (result == 0) {
            result = this.getNumberOfDays().compareTo(o.getNumberOfDays());
        }

        return result;
    }

    public static String scanString() {
        String data = scanner.nextLine();
        return data;
    }

    public static int scanInt() {
        int data = scanner.nextInt();
        return data;
    }

    public static boolean containTypeOfVoucher(String s) {
        for (TypeOfVouchers type : TypeOfVouchers.values()) {
            if (type.name().equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containTypeOfTransport(String s) {
        for (Transport transport : Transport.values()) {
            if (transport.name().equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containTypeOfTNutrition(String s) {
        for (Nutrition nutrition : Nutrition.values()) {
            if (nutrition.name().equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static TravelVoucher createVoucher() {
        TravelVoucher travelVoucher = new TravelVoucher();

        System.out.println("Enter country: ");
        String country = scanString();
        travelVoucher.setCountry(country);

        System.out.println("Enter type of vouchers: ");
        String vouchType = null;
        while (true) {
            vouchType = scanString();
            if (containTypeOfVoucher(vouchType)) {
                travelVoucher.setTypeOfVouchers(TypeOfVouchers.valueOf(vouchType));
                break;
            } else {
                System.out.println("You enter wrong data. Try again.");
            }
        }

        System.out.println("Enter type of transport: ");
        String transport = null;
        while (true) {
            transport = scanString();
            if (containTypeOfTransport(transport)) {
                travelVoucher.setTransport(Transport.valueOf(transport));
                break;
            } else {
                System.out.println("You enter wrong data. Try again.");
            }
        }


        System.out.println("Enter nutrition: ");
        String nutrition = null;
        while (true) {
            nutrition = scanString();
            if (containTypeOfTNutrition(nutrition)) {
                travelVoucher.setNutrition(Nutrition.valueOf(nutrition));
                break;
            }
        }

        System.out.println("Enter travels days number: ");
        int daysNum;
        while (true) {
            daysNum = scanInt();
            if (daysNum > 0) {
                travelVoucher.setNumberOfDays(daysNum);
                break;
            }
        }

        return travelVoucher;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public TypeOfVouchers getTypeOfVouchers() {
        return typeOfVouchers;
    }

    public void setTypeOfVouchers(TypeOfVouchers typeOfVouchers) {
        this.typeOfVouchers = typeOfVouchers;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Nutrition getNutrition() {
        return nutrition;
    }

    public void setNutrition(Nutrition nutrition) {
        this.nutrition = nutrition;
    }

    public Integer getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(Integer numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
}
