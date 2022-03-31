package ru.netology.stats;

public class StatsService {

    public static int summOfSales(long[] sales) {
        int sum = 0;
        for (long summ : sales) {
            sum += summ;
        }
        return sum;
    }

    public static int avgSummOfSalesPerMonth(long[] sales) {
        int sum = 0;
        for (long summ : sales) {
            sum += summ;
        }
        return sum / sales.length;
    }

    public static int monthWithMaxOfSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public static int monthWithMinOfSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public static int countMonthWithLowerAvgOfSales(long[] sales) {
        int countMonth = 0;
        int sum = 0;
        for (long summ : sales) {
            sum += summ;
        }
        long avgOfSales = sum / sales.length;
        for (long avg : sales) {
            if (avg < avgOfSales) {
                countMonth++;
            }
        }
        return countMonth;
    }

    public static int countMonthWithHigherAvgOfSales(long[] sales) {
        int countMonth = 0;
        int sum = 0;
        for (long summ : sales) {
            sum += summ;
        }
        long avgOfSales = sum / sales.length;
        for (long avg : sales) {
            if (avg >= avgOfSales) {
                countMonth++;
            }
        }
        return countMonth;
    }
}
