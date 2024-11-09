package ru.netology.homeworkCycles.service;

public class MonthOfRestCounterService {
    public int calculate(int income, int expense, int threshold) {
        int money = 0;
        int countMonthRest = 0;

        for (int month = 1; month < 13; month++) {
            if (money >= threshold) {
                countMonthRest++;

                money = money - expense;
                money = money / 3;
            } else {
                money = money + income - expense;
            }
        }

        return countMonthRest;
    }
}
