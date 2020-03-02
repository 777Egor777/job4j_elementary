package ru.job4j.condition;

public class SqArea {
    public static double sqr(double number) {
        return Math.pow(number, 2);
    }

    public static double square(int p, int k) {
        double h = SqArea.height(p, k);
        double rsl = k * SqArea.sqr(h);
        return rsl;
    }

    public static double height(int p, int k) {
        double rsl = p / (2.0 * (k + 1));
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        double height1 = SqArea.height(4, 1);
        System.out.println(" p = 4, k = 1, h = " + height1 + ", real = " + result1);

        double result2 = SqArea.square(6, 2);
        double height2 = SqArea.height(6, 2);
        System.out.println(" p = 6, k = 2, h = " + height2 + ", real = " + result2);
    }
}
