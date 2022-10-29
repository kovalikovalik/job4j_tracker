package ru.job4j.poly;

public interface Transport {
    boolean ride();

    int passengers(int passengers);

    int refill(int value);
}
