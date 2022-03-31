package ru.netology.sqr;

public class SQRService {
    public int getCountOfSquareInRange(int start, int end) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if (square >= start && square <= end) {
                count++;
            }
        }
        return count;
    }
}




