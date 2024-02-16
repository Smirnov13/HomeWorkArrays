package ru.netology.HomeWorkArrays.services;

public class StatsService {
    public long sumSales(long[] sales) {
        long summSale = 0;
        for (int i = 0; i < sales.length; i++) {
            summSale = summSale + sales[i];
        }
        return summSale;
    }

    public long averageSumSales(long[] sales) {
        long sum = 0;
        long averageSum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        averageSum = sum / sales.length;
        return averageSum;
    }

    public int maxMonthSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minMonthSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м
                // месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0,
        // нужно сдвинуть ответ на 1
    }

    public int belowAverageSales(long[] sales) {
        long averageSum = averageSumSales(sales);
        int belowAverMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum){
                belowAverMonth = belowAverMonth + 1;
            }
        }
        return belowAverMonth;
    }

    public int aboveAverageSales(long[] sales) {
        long averageSum = averageSumSales(sales);
        int aboveAverMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum){
                aboveAverMonth = aboveAverMonth + 1;
            }
        }
        return aboveAverMonth;
    }
}
