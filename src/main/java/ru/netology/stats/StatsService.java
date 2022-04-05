package ru.netology.stats;

public class StatsService {

    public static int summOfSales(int[] sales) {
        int sum = 0;
        for (int summ : sales) {
            sum += summ;
        }
        return sum;
    }

    public static int avgSummOfSalesPerMonth(int[] sales) {
        return summOfSales(sales) / sales.length;
    }

    public static int monthWithMaxOfSales(int[] sales) {
        int max = sales[0];
        int indexForMax = 0;
        for (int i = 0; i < sales.length; i++) {
            int score = sales[i];
            if (max < score) {
                max = score;
                indexForMax = i;
            }
        }
        return indexForMax + 1;
    }

    public static int monthWithMinOfSales(int[] sales) {
        int min = sales[0];
        int indexForMin = 0;
        for (int i = 0; i < sales.length; i++) {
            int score = sales[i];
            if (min > score) {
                min = score;
                indexForMin = i;
            }
        }
        return indexForMin + 1;
    }

    public static int countMonthWithLowerAvgOfSales(int[] sales) {
        int countMonth = 0;
        int avgSales = avgSummOfSalesPerMonth(sales);
        for (int avg : sales) {
            if (avg < avgSales) {
                countMonth++;
            }
        }
        return countMonth;
    }

    public static int countMonthWithHigherAvgOfSales(int[] sales) {
        int countMonth = 0;
        int avgSales = avgSummOfSalesPerMonth(sales);
        for (int avg : sales) {
            if (avg >= avgSales) {
                countMonth++;
            }
        }
        return countMonth;
    }
}
