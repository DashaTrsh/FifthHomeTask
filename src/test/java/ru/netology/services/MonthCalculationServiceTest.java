package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class MonthCalculationServiceTest {
    @ParameterizedTest
//    @CsvSource({
//            "3,10000, 3000, 20000,0,0",
//            "2,100000,60000,150000,0,0"})
    @CsvFileSource(files = "src/test/resources/conditions.csv")

    public void firstCaseTest(int expected, int income, int expenses, int threshold, int money, int count) {
        MonthCalculationService service = new MonthCalculationService();
        //int expected = 3;
        int actual = service.monthsCalculation(income, expenses, threshold, money, count);
        Assertions.assertEquals(expected, actual);
    }
}

//    @Test
//    public void secondCaseTest() {
//        MonthCalculationService service = new MonthCalculationService();
//        int expected = 2;
//        int actual = service.monthsCalculation(100_000, 60_000, 150_000, 0, 0);
//        Assertions.assertEquals(expected, actual);
//    }
//}

