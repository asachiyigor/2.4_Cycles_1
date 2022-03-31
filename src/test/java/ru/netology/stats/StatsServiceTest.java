package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSummOfSales() {

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = StatsService.summOfSales(sales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateAvgSummOfSalesPerMonths() {

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = StatsService.avgSummOfSalesPerMonth(sales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateMonthWithMaxOfSales() {

        long[] sales = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18};
        long expected = 6;

        long actual = StatsService.monthWithMaxOfSales(sales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateMonthWithMinOfSales() {

        long[] sales = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = StatsService.monthWithMinOfSales(sales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateCountMonthWithLowerAvgOfSales() {

        long[] sales = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = StatsService.countMonthWithLowerAvgOfSales(sales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateCountMonthWithHigherAvgOfSales() {

        long[] sales = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18};
        long expected = 7;

        long actual = StatsService.countMonthWithHigherAvgOfSales(sales);

        assertEquals(expected, actual);

    }
}