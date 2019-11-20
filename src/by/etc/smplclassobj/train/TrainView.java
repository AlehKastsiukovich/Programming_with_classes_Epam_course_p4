package by.etc.smplclassobj.train;


public class TrainView {

    public void printAll(Train[] trains) {
        for (Train train : trains) {
            System.out.println("Number of the train - " + train.getNumberOfTrain() + "\n" +
                    "Departure time - " + train.getDepartureTime() + "\n" +
                    "Destination station - " + train.getDestination() + "\n" +
                    "-----------------------------------------------------");
        }
    }

    public void printTrain(Train train) {
        System.out.println("Number of the train - " + train.getNumberOfTrain() + "\n" +
                "Departure time - " + train.getDepartureTime() + "\n" +
                "Destination station - " + train.getDestination());
    }


    public Train trainInformation(Train[] trains, int number) {
        for (Train train : trains) {

            if (train.getNumberOfTrain() == number) {
                return train;
            }
        }

        return null;
    }
}
