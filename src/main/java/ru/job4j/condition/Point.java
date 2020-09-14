package ru.job4j.condition;

/**
 * Class model point on the plane/space
 * @author Geraskin Egor
 */
public class Point {
    /**
     * first coordinate x of the point
     */
    private int x;

    /**
     * second coordinate y of the point
     *
     */
    private int y;

    /**
     * third coordinate z of the point
     */
    private int z;

    /**
     * Constructor, that accept initial
     * state of the object
     * @param x - first coordinate of the point
     * @param y - second coordinate of the point
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructor, that accept initial
     * state of the object
     * @param x - first coordinate of the point
     * @param y - second coordinate of the point
     * @param z - third coordinate of the point
     */
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Getter of the first coordinate x
     * @return first coordinate x of the point
     */
    public int getX() {
        return this.x;
    }

    /**
     * Getter of the second coordinate y
     * @return second coordinate y of the point
     */
    public int getY() {
        return this.y;
    }

    /**
     * Getter of the third coordinate z
     * @return third coordinate z of the point
     */
    public int getZ() {
        return this.z;
    }

    /**
     * Method that return square
     * of the number
     * @param number - input number
     * @return square of the input number
     */
    public static double sqr(double number) {
        return Math.pow(number, 2);
    }

    /**
     * Method that return distance
     * between two points - this
     * and another
     * @param another - second point
     * @return distance between two points
     */
    public double distance(Point another) {
        return Math.sqrt(
                                Point.sqr(another.getX() - this.x) +
                                Point.sqr(another.getY() - this.y)
        );
    }

    /**
     * Method return distance between
     * two points in space (it means
     * that we use 3 coordinates of points)
     * @param another - second point
     * @return distance
     */
    public double distance3d(Point another) {
        return  Math.sqrt(Point.sqr(this.distance(another)) +
                          Point.sqr(this.z - another.getZ()));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
