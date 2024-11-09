package ru.netology.homeworkCycles.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestMonthOfRestCounter {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testData.csv")
    public void testMonthOfRestCounter(int expected, int income, int expense, int threshold) {
        MonthOfRestCounterService monthOfRestCounterService = new MonthOfRestCounterService();

        int actual = monthOfRestCounterService.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
