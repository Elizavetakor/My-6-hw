package ru.netology.stats;

public class StatsService {

    public int getMinMonth(int[] sales){
        int minMonth = 0;
        for (int i=0; i<sales.length; i++) {
            if (sales[i] < sales[minMonth]);
            minMonth = i;
        }
        return minMonth;
    }

    public int getSumSales(int[] sales){
        int sumSale = 0;

        for (int i=0; i<sales.length; i++) {
            sumSale += sales[i] ;
        }
        return sumSale;
    }

    public int getAverageAmount(int[] sales){
        int average = sales[0];
        int length = sales.length;

        for (int i=0; i<sales.length; i++) {
            average += sales[i];
        }
        return average/length;
    }

    public int getMaxMonth(int[] sales){
        int maxMonth = 0;
        for (int i=0; i<sales.length; i++) {
            if (sales[i] > sales[maxMonth]);
            maxMonth = i;
        }
        return maxMonth;
    }

    public int getMinAverage(int[] sales){

        int minAverage = 0;
        int getAverageAmount(int[] sales);
        for (int i=0; i<sales.length; i++) {
            if (sales[i] < getAverageAmount);
            minAverage += i;
    }
        return minAverage;

}
