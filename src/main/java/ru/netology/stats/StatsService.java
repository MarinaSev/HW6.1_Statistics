package ru.netology.stats;

public class StatsService {

    //    Сумма всех продаж
    public int calulateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //    Средняя сумма продаж в месяц
    public int findAvrg(int[] sales) {
        return calulateSum(sales) / sales.length;
    }

    //    Номер месяца, в котором был пик продаж
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    //    Номер месяца, в котором был минимум продаж
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    //    Кол-во месяцев, в которых продажи были ниже среднего
    public int underAvrgSales(int[] sales) {
        int underAvrgMonths = 0;
        for (int sale : sales) {
            if (sale < findAvrg(sales)) {
                underAvrgMonths = underAvrgMonths + 1;
            }
        }
        return underAvrgMonths;
    }

    //    Кол-во месяцев, в которых продажи были выше среднего
    public int overAvrgSales(int[] sales) {
        int overAvrgMonths = 0;
        for (int sale : sales) {
            if (sale > findAvrg(sales)) {
                overAvrgMonths = overAvrgMonths + 1;
            }
        }
        return overAvrgMonths;
    }

}
