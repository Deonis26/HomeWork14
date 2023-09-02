package Train;

public interface AbstractTrain {
    void refillingForTrain(int litres); //заправка

    void trainLoading(); // загрузка поезда

    void unloadingTrain(); //разгрузка
    void statusChange(String status); // изменение статуса
    void trainDeparture(); // отправка поезда

}
