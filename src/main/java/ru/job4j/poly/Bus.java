package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("Автобус едет по маршруту ");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("Количество пассажиров: " + passengers);
    }

    @Override
    public int refill(int value) {
        int price = 50;
        return price * value;
    }
}
