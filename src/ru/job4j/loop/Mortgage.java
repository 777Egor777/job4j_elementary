package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, int percent) {
        int result = 1;
        double currentDebt = amount * (1 + percent / 100.0);
        while (currentDebt > salary) {
            result++;
            currentDebt -= salary;
            currentDebt *= (1 + percent / 100.0);
        }
        return result;
    }
}
