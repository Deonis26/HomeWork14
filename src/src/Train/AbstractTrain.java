package Train;

public interface AbstractTrain {
    void refillingForTrain(int litres); //заправка

    void unloadingTrain(); //разгрузка
    void statusChange(); // изменение статуса
    void trainDeparture(); // отправка поезда

}
