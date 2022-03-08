package ru.netology.sqr;

public class SQRService {
    public int SqrCount(int lowerRangeLimit, int upperRangeLimit) {
        int counter = 0;

        for (int i = 10; i < 100; i++) {
            if (i * i >= lowerRangeLimit) {
                if (i * i <= upperRangeLimit) {
                    counter++;
                }
            }
        }
        return counter;

    }
}
