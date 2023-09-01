package Train;

public class Train implements AbstractTrain {
    private String numberTrain; // номер поезда
    private String route; // маршрут
    private int distanceBetweenCities; //расстояние между городами
    private String status;//статус
    private int quantityLiter; //количество литров
    private int fuelConsumption; // расход топлива на 100 км
    private TrafficCongestion type;

    public Train(String numberTrain, String route, int distanceBetweenCities, String status, int quantityLiter, int fuelConsumption, TrafficCongestion type) {
        this.numberTrain = numberTrain;
        this.route = route;
        this.distanceBetweenCities = distanceBetweenCities;
        this.status = status;
        this.quantityLiter = quantityLiter;
        this.fuelConsumption = fuelConsumption;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Train{" +
                "numberTrain='" + numberTrain + '\'' +
                ", route='" + route + '\'' +
                ", distanceBetweenCities=" + distanceBetweenCities +
                ", status='" + status + '\'' +
                ", quantityLiter=" + quantityLiter +
                ", fuelConsumption=" + fuelConsumption +
                ", type=" + type +
                '}';
    }

    @Override
    public void refillingForTrain(int litres) {
        quantityLiter =litres+ quantityLiter;
        System.out.println("Количество топлива в баке: "+quantityLiter);

    }



    @Override
    public void unloadingTrain() {

    }

    @Override
    public void statusChange() {

    }

    @Override
    public void trainDeparture() {
            if (distanceBetweenCities<(quantityLiter*(fuelConsumption/100))){
                quantityLiter=quantityLiter-(distanceBetweenCities*(fuelConsumption/100));
                System.out.println("Топлива хватит. Остаток топлива в баке: "+quantityLiter);
                System.out.println(quantityLiter);
            } else {
                throw new NotEnoughFuelException("Топливо закончилось");
            }
    }
}
