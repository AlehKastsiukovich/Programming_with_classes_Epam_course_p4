package by.etc.smplclassobj.train;


public class Train implements Comparable<Train> {
    private String destination;
    private int numberOfTrain;
    private double departureTime;
    private static Train[] trainsData;

    public Train(String destination, int numberOfTrain, double departureTime) {
        this.destination = destination;
        this.departureTime = departureTime;
        this.numberOfTrain = numberOfTrain;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumberOfTrain() {
        return numberOfTrain;
    }

    public void setNumberOfTrain(int numberOfTrain) {
        this.numberOfTrain = numberOfTrain;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    public static Train[] getTrainsData() {
        return trainsData;
    }

    public static void setTrainsData(Train[] trainsData) {
        Train.trainsData = trainsData;
    }

    @Override
    public int compareTo(Train o) {
        int result = this.destination.compareTo(o.destination);

        if (result == 0) {
            result = Double.compare(this.departureTime, o.departureTime);
        }

        return result;
    }
}
