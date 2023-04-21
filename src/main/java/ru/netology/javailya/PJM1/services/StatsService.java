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
        int result = 0;
        int [] nums = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        for (int i : nums) {
            result += i;
        }
        return result / nums.length;
    }

    public int salesSum (long[] sales) {
        int sum = 0;
        int allDatas[] = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        for (int i = 0; i < allDatas.length; i++) {
            sum = sum + allDatas[i];
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