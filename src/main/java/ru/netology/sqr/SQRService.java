package ru.netology.sqr;

public class SQRService {
    public int sqrRange(int downsqr, int highsqr) {

        int range = 0;

        for (int i = 10; 10 <= i && i <= 99; i++) {

            int sqr = (i * i);

            if (downsqr <= sqr && sqr <= highsqr) {

                range++;
            }
        }
        return range;
    }
}