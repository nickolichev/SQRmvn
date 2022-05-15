package ru.netology.sqr;

public class SQRService {
    public int SQRRange(int down, int high, int downsqr, int highsqr) {

        int range = 0;

        for (int i = down; down <= i && i <= high; i++) {

            int sqr = (i * i);

            if (downsqr <= sqr && sqr <= highsqr)

                range++;
        }
        return range;
    }
}