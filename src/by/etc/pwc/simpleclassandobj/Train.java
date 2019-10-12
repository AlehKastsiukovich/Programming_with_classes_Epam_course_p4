package by.etc.pwc.simpleclassandobj;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Создайте класс Train, содержащий поля: названия пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из 5-ти элементов типа Train. Добавьте возможность сортировки элементов
 * массива по номерам поездов. Добавьте возможность вывода информации о поезде номер которого введен
 * пользователем. Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми
 * пунктами назначения должны быть упорядочены по времени отправления.
 */

public class Train implements Comparable <Train>{
    private String destination;
    private int numberOfTrain;
    private double departureTime;
    private static Train [] trainsData;

    public Train(String destination, int numberOfTrain, double departureTime) {
            this.destination = destination;
            this.departureTime = departureTime;
            this.numberOfTrain = numberOfTrain;
        }

    public String toString() {
            return "Number of the train - " + this.numberOfTrain + "\n" +
                    "Departure time - " + this.departureTime + "\n" +
                    "Destination station - " + this.destination + "\n"+
                    "-----------------------------------------------------";
    }

    public static void sort(Train [] trains) {
        Arrays.sort(trains);
        for(Train x: trains) {
            System.out.println(x.toString());
        }
    }

    @Override
    public int compareTo(Train o) {
        int result = this.destination.compareTo(o.destination);

        if(result == 0) {
            result = Double.compare(this.departureTime, o.departureTime);
        }

        return result;
    }

    public static void viewInformation() {
        int number = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of train: ");
        number = scanner.nextInt();

        for (Train train : trainsData) {
            if (train.numberOfTrain == number) {
                System.out.println(train.toString());
            }
        }
    }

    public static void main(String[] args) {
        Train train1 = new Train("Minsk",900,14.02);
        Train train2 = new Train("Kiev",910,23.05);
        Train train3 = new Train("Minsk",866,13.44);
        Train train4 = new Train("Warsaw",950,15.25);
        Train train5 = new Train("Vilnius",999,21.19);
        trainsData = new Train[5];
        trainsData[0] = train1;
        trainsData[1] = train2;
        trainsData[2] = train3;
        trainsData[3] = train4;
        trainsData[4] = train5;

        viewInformation();
    }
}
