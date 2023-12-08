package ru.netology.stats;

public class StatsService {

    public int getSumSales(int[] sales) {
        int sumSale = 0;

        for (int sale : sales) {
            sumSale += sale;
        }
        return sumSale;
    }

    public int getAverageAmount(int[] sales) {
        return getSumSales(sales) / sales.length;
    }


    public int getMaxMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int getMinMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int salesBelowAverage(int[] sales) {
        int counter = 0;
        int averageSale = getAverageAmount(sales);
        for (int sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int salesAboveAverage(int[] sales) {
        int counter = 0;
        int averageSale = getAverageAmount(sales);
        for (int sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}
