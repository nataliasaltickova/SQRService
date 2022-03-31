package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void shouldCalculateCountInRange() {

        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.getCountOfSquareInRange(200, 300);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateCountLowerRange() {

        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.getCountOfSquareInRange(0, 99);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateCountFullRange() {

        SQRService service = new SQRService();
        int expected = 90;
        int actual = service.getCountOfSquareInRange(100, 9801);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateCountOutRange() {

        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.getCountOfSquareInRange(9802, Integer.MAX_VALUE);
        Assertions.assertEquals(expected, actual);

    }
}
