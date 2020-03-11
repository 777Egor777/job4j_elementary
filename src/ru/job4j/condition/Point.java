package ru.job4j.condition;

public class Point {
    private int x;
    private int y;

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static double sqr(double number) {
        return Math.pow(number, 2);
    }

    public double distance(Point another) {
        double rsl = Math.sqrt(
                                Point.sqr(another.getX() - this.x) +
                                Point.sqr(another.getY() - this.y)
        );
        return rsl;
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
