package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCalcSqrListIfCorrectRange() {

        SQRService service = new SQRService();

        int actual = service.SQRRange(10, 99, 300, 600);
        int expected = 7;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcSqrListIfUpDown() {

        SQRService service = new SQRService();

        int actual1 = service.SQRRange(24, 99, 300, 600);
        int expected1 = 7;

        assertEquals(actual1, expected1);
    }

    @Test
    public void shouldCalcSqrListIfUnderHigh() {
        SQRService service = new SQRService();

        int actual2 = service.SQRRange(10, 23, 300, 600);
        int expected2 = 7;

        assertEquals(actual2, expected2);
    }

    @Test
    public void shouldCalcSqrListIfUpDownSQR() {
        SQRService service = new SQRService();

        int actual3 = service.SQRRange(10, 99, 590, 600);
        int expected3 = 7;

        assertEquals(actual3, expected3);
    }

    @Test
    public void shouldCalcSqrListIfUnderHighSQR() {
        SQRService service = new SQRService();

        int actual4 = service.SQRRange(10, 99, 300, 310);
        int expected4 = 7;

        assertEquals(actual4, expected4);
    }
}