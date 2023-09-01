package Train;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Train train = new Train("1234", "231", 1090, "Активный", 1000, 100 , TrafficCongestion.TRANSPORT_IS_EMPTY);
        System.out.println(train);
        train.refillingForTrain(100);
        train.trainDeparture();
        System.out.println(train);
    }
}
