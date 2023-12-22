package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public class MonthCalculationServiceTest {
    @Test
    public void firstCaseTest() {
        MonthCalculationService service = new MonthCalculationService();
        int expected = 3;
        int actual = service.monthsCalculation(10_000, 3_000, 15_000, 0, 0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void secondCaseTest() {
        MonthCalculationService service = new MonthCalculationService();
        int expected = 2;
        int actual = service.monthsCalculation(100_000, 60_000, 150_000, 0, 0);
        Assertions.assertEquals(expected, actual);
    }
}

