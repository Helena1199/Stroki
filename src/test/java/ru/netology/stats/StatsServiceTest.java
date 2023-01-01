package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    //Сумма всех продаж
    @Test
    public void shouldFindSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long actualSum = service.getSumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    // Средняя сумма продаж в месяц
    @Test
    public void shouldFindAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverage = 15;
        long actualAverage = service.getAverage(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    // Продажи на максимальную сумму
    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        long actualMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    // Продажи на минимальную сумму
    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonth = 9;
        long actualMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    //Количество месяцев, в которых продажи были ниже среднего
    @Test
    public void shouldFindLessAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 5;
        long actualMonth = service.getLessAverage(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    //Количество месяцев, в которых продажи были выше среднего
    @Test
    public void shouldFindMoreAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonth = 5;
        long actualMonth = service.getMoreAverage(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }
}