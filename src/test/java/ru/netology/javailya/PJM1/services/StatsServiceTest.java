package ru.netology.javailya.PJM1.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldfindminMonth () {
        StatsService service = new StatsService();
        long[] month = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMonth = 9;
        int actualMonth = service.minSales(month);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void sholdfindmaxMonth () {
        StatsService service = new StatsService();
        long[] month = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMonth = 8;
        int actualMonth = service.maxSales(month);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldcalculateMiddleSales () {
        StatsService service = new StatsService();
        long[] result = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMiddle = 15;
        int actualMiddle = service.middleSales(result);

        Assertions.assertEquals(expectedMiddle, actualMiddle);
    }

    @Test
    public void shouldcalculateSum() {
        StatsService service = new StatsService();
        long[] sum = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedSum = 180;
        int actualSum = service.salesSum(sum);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldsearchUnderMiddle() {
        StatsService service = new StatsService();
        long[] month = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMonth = 11;
        int actualMonth = service.underMiddle(month);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldsearchOvermiddle () {
        StatsService service = new StatsService();
        long[] month = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMonth = 12;
        int actualMonth = service.overMiddle(month);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }
}
