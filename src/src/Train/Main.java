package Train;


public class Main {
    public static void main(String[] args) {
        Train train = new Train("1234", "231", 1090, "Активный", 1000, 100 , TrafficCongestion.TRANSPORT_IS_EMPTY);
        System.out.println(train);
        train.refillingForTrain(100);
        train.trainDeparture();
        System.out.println(train);
      //  train.statusChange("в пути");
       // train.trainLoading();
        train.unloadingTrain();

    }
}
