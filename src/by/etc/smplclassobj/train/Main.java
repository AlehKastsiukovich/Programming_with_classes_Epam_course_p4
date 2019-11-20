package by.etc.smplclassobj.train;


import java.util.Scanner;

/**
 * Создайте класс Train, содержащий поля: названия пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из 5-ти элементов типа Train. Добавьте возможность сортировки элементов
 * массива по номерам поездов. Добавьте возможность вывода информации о поезде номер которого введен
 * пользователем. Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми
 * пунктами назначения должны быть упорядочены по времени отправления.
 */

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        TrainLogic logic = new TrainLogic();
        TrainView view = new TrainView();

        Train train1 = new Train("Minsk", 900, 14.02);
        Train train2 = new Train("Kiev", 910, 23.05);
        Train train3 = new Train("Minsk", 866, 13.44);
        Train train4 = new Train("Warsaw", 950, 15.25);
        Train train5 = new Train("Vilnius", 999, 21.19);

        Train[] trains = new Train[5];

        trains[0] = train1;
        trains[1] = train2;
        trains[2] = train3;
        trains[3] = train4;
        trains[4] = train5;

        System.out.println("Enter number of train: ");

        int number;

        while (true) {
            while (!scanner.hasNextInt()) {
                scanner.next();
            }

            number = scanner.nextInt();

            if (number > 0) {
                break;
            }
        }

        logic.sort(trains);

        view.trainInformation(trains, number);
    }
}
