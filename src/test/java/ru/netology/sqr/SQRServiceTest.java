package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"200,300,3", "100,9801,90", "1,2,0", "100,101,1", "99,9801,90", "101,9801,89", "100,9800,89", "100,9802,90"})
    void shouldSqrCount(int lowerRangeLimit, int upperRangeLimit, int expected) {
        SQRService service = new SQRService();
        int actual = service.sqrCount(lowerRangeLimit, upperRangeLimit);

        assertEquals(expected, actual);
    }
}