package ru.netology.HomeWorkArrays.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 4, 14, 18
        };
        int expectedSum = 170;
        long actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }


    @Test
    public void averageSumSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 4, 14, 18
        };
        int expectedAverageSum = 14;
        long actualAverageSum = service.averageSumSales(sales);

        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }


    @Test
    public void maxMonthSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 4, 14, 18
        };
        int expectedMaxMonth = 8;
        long actualMaxMonth = service.maxMonthSales(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }


    @Test
    public void minMonthSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 4, 14, 18
        };
        int expectedMinMonth = 10;
        long actualMinMonth = service.minMonthSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }


    @Test

    public void belowAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 4, 14, 18
        };
        int expectedBelowAverage = 4;
        long actualBelowAverage = service.belowAverageSales(sales);

        Assertions.assertEquals(expectedBelowAverage, actualBelowAverage);
    }


    @Test

    public void aboveAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 4, 14, 18
        };
        int expectedAboveAverage = 7;
        long actualAboveAverage = service.aboveAverageSales(sales);

        Assertions.assertEquals(expectedAboveAverage, actualAboveAverage);
    }
}