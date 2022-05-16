package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCalcSqrListIfCorrectRange() {

        SQRService service = new SQRService();

        int actual = service.sqrRange( 300, 600);
        int expected = 7;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalcSqrListIfDownSQR() {

        SQRService service = new SQRService();

        int actual1 = service.sqrRange(50, 600);
        int expected1 = 15;

        assertEquals(actual1, expected1);
    }

    @Test
    public void shouldCalcSqrListIfHighSQR() {
        SQRService service = new SQRService();

        int actual2 = service.sqrRange(300, 900);
        int expected2 = 13;

        assertEquals(actual2, expected2);
    }

    @Test
    public void shouldCalcSqrListIfUpDownSQR() {
        SQRService service = new SQRService();

        int actual3 = service.sqrRange(590, 600);
        int expected3 = 0;

        assertEquals(actual3, expected3);
    }

    @Test
    public void shouldCalcSqrListIfUnderHighSQR() {
        SQRService service = new SQRService();

        int actual4 = service.sqrRange(300, 310);
        int expected4 = 0;

        assertEquals(actual4, expected4);
    }
}