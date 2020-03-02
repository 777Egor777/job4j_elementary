package ru.job4j.condition;

public class Point {
    public static double sqr(double number) {
        return Math.pow(number, 2);
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Point.sqr(x2 - x1) + Point.sqr(y2 - y1));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(5, 3, 3, 3);
        System.out.println("result (5, 3) to (3, 3) " + result);
        result = Point.distance(5, 0, 2, 0);
        System.out.println("result (5, 0) to (2, 0) " + result);
        result = Point.distance(0, 2, 2, 0);
        System.out.println("result (0, 2) to (2, 0) " + result);
    }
}
