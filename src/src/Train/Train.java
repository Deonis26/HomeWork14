package Train;

public class Train implements AbstractTrain{
   private String numberTrain; // номер поезда
   private String route; // маршрут
   private int distanceBetweenCities; //расстояние между городами
   private String status;//статус
   private int quantityLiter; //количество литров
   private int fuelConsumption; // расход топлива на 100 км

     public Train(String numberTrain, String route, int distanceBetweenCities, String status, int quantityLiter, int fuelConsumption ) {
        this.numberTrain=numberTrain;
        this.route=route;
        this.distanceBetweenCities=distanceBetweenCities;
        this.status=status;
        this.quantityLiter=quantityLiter;
        this.fuelConsumption=fuelConsumption;
    }

}
