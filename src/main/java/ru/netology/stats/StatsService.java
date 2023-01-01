package ru.netology.stats;

public class StatsService {
    //Сумма всех продаж
    public long getSumSales(long[] sales) {
        long sumSales = 0;
        for (long i = 0; i < sales.length; i++) {
            sumSales += sales[(int) i];
        }
        return sumSales;
    }

    // Средняя сумма продаж в месяц
    public long getAverage(long[] sales) {
        long sumSales = getSumSales(sales);
        long average = sumSales / sales.length;
        return average;
    }

    // Продажи на максимальную сумму
    public int maxSales(long[] sales) {
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

    // Продажи на минимальную сумму
    public long minSales(long[] sales) {
        long minMonth = 0;
        long month = 0;
        for (long sale : sales) {
            if (sale <= sales[(int) minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    //Количество месяцев, в которых продажи были ниже среднего
    public int getLessAverage(long[] sales) {
        int lessAverage = 0;
        long average = getAverage(sales);
        for (long sale : sales) {
            if (sale < average) {
                lessAverage++;
            }
        }
        return lessAverage;
    }

    //Количество месяцев, в которых продажи были выше среднего
    public long getMoreAverage(long[] sales) {
        long average = getAverage(sales);
        long MoreAverage = 0;
        for (long sale : sales) {
            if (sale > average) {
                MoreAverage++;
            }
        }
        return MoreAverage;
    }
}