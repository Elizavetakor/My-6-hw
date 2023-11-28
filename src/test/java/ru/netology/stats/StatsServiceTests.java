package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTests {
    @Test

    public void findMinMonth(){

        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expectedMonth = 8;
        int actualMonth = (int) service.getMinMonth(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void findSumSales(){

        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expectedSum = 180;
        int actualSum = (int) service.getSumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void findAverageAmount(){

        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expectedAverage = 15;
        int actualAverage = (int) service.getAverageAmount(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void findMaxMonth(){

        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expectedMaxMonth = 6;
        int actualMaxMonth = (int) service.getMaxMonth(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void findMinAverMonths(){

        StatsService service = new StatsService();
        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expectedMinAver = 5;
        int actualMinAver = (int) service.getMinAverage(sales);

        Assertions.assertEquals(expectedMinAver, actualMinAver);
    }
}
