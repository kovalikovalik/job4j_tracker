package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public boolean ride() {
        return false;
    }

    @Override
    public int passengers(int passengers) {
        return passengers;
    }

    @Override
    public int refill(int value) {
        int price = 50;
        return price * value;
    }
}
