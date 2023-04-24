package ru.netology.javailya.PJM1.services;
public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth] ) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int middleSales(long[] sales) {
        return salesSum(sales) / sales.length;
    }

    public int salesSum (long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int underMiddle (long[] sales) {
        int month = 0;
        int middle = middleSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < middle) {
                month = i;
            }
        }
        return month + 1;
    }

    public int overMiddle (long[] sales) {
        int month = 0;
        int middle = middleSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > middle) {
                month = i;
            }
        }
        return month + 1;
    }


}