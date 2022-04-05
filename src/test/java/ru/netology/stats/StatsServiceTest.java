package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSummOfSales() {

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = StatsService.summOfSales(sales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateAvgSummOfSalesPerMonths() {

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = StatsService.avgSummOfSalesPerMonth(sales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateMonthWithMaxOfSales() {

        int[] sales = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18};
        int expected = 6;

        int actual = StatsService.monthWithMaxOfSales(sales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateMonthWithMinOfSales() {

        int[] sales = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = StatsService.monthWithMinOfSales(sales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateCountMonthWithLowerAvgOfSales() {

        int[] sales = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = StatsService.countMonthWithLowerAvgOfSales(sales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateCountMonthWithHigherAvgOfSales() {

        int[] sales = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18};
        int expected = 7;

        int actual = StatsService.countMonthWithHigherAvgOfSales(sales);

        assertEquals(expected, actual);

    }
}