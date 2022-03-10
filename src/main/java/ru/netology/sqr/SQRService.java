package ru.netology.sqr;

public class SQRService {
    public int sqrCount(int lowerRangeLimit, int upperRangeLimit) {
        int counter = 0;

        for (int i = 10; i < 100; i++) {
            if (i * i >= lowerRangeLimit && i * i <= upperRangeLimit) {
                counter++;
            }
        }
        return counter;

    }
}
