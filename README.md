# HomeWork14
1. Создать интерфейс Поезд (AbstractTrain). Создать класс поезд. Определить в нем поля: номер поезда
маршрут, расстояние между городами по маршруту, статус (в пути, загружается, разгружается), количество литров
в баке, расход на 100 км, загруженность (Enum: загружен, пустой).
2. Определить методы в интерфейсе заправка, отправление, смена статуса, разгрузка.
3. Реализовать метод заправки (просто прибавить залить топливо в бак и сложить).
4. Отправление (произвести проверку, если до конечной точки маршрута не хватит топлтива в баке, то выбросить свое собсвенное исключение)
5. Реализовать методы загрузки и разгрузки. При этом если статус в пути, то мы не можем выполнять загрузку или разгрузку. Выбросить свое исключение
6.  Если мы хотим загрузиться, а поезд полон, то выбрасываем исключение. 
7. Если мы хотим разгрузиться, а поезд пустой, то выбрасываем исключение.
