package by.etc.smplclassobj.airline;


import java.util.List;

/**
 * Создать класс Airline. Определить конструкторы, сеттеры, геттеры, toString(). Создать второй класс
 * агрегирующий массив типа Airlines с подходящими конструкторами и методами. Задать критерии выбора
 * данных и вывести их на консоль.
 * Airlines - пункт назначения, номер рейса, тип самолета, время вылета, дни недели
 * -Список рейсов для заданного пункта назначения
 * -список рейсов для заданного дня недели
 * -список рейсов для заданного дня недели, время вылета для котрых больше заданного
 */

public class Main {

    public static void main(String[] args) {
        AirPortView view = new AirPortView();
        Airport airport = new Airport("Minsk - 1");
        AirPortLogic logic = new AirPortLogic();

        Airline airline = new Airline(
                "Minsk",
                1001,
                AirLiner.BOEING_777,
                23.00,
                Days.MONDAY
        );

        Airline airline2 = new Airline(
                "Kiev",
                1005,
                AirLiner.AIRBUS_A340,
                13.00,
                Days.WEDNESDAY
        );

        logic.addAirline(airport, airline);
        logic.addAirline(airport, airline2);

        for (Airline air : airport.getAirlines()) {
            if (air != null) {
                view.printAirline(air);
            }
        }

        List<Airline> list = logic.getListByDestination(airport, "Minsk");

        System.out.println("Departure from Minsk: \n" );
        for (Airline airL: list) {
            view.printAirline(airL);
        }
    }
}
