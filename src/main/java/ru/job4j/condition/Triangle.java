package ru.job4j.condition;

import static java.lang.Math.*;

/**
 * Calculating area of the triangle
 * @author Geraskin Yegor(yegeraskin13@gmail.com)
 */
public class Triangle {
    /**
     * Three vertux of the triangle
     */
    private Point firstVertex;
    private Point secondVertex;
    private Point thirdVertex;

    /**
     * Standart constructor
     */
    public Triangle(Point firstVertex, Point secondVertex, Point thirdVertex) {
        this.firstVertex = firstVertex;
        this.secondVertex = secondVertex;
        this.thirdVertex = thirdVertex;
    }

    /**
     * Method calculate area of the triangle
     * @return area of the triangle
     */
    public double area() {
        double result = -1;
        double firstSide = this.firstVertex.distance(this.secondVertex);
        double secondSide = this.firstVertex.distance(this.thirdVertex);
        double thirdSide = this.thirdVertex.distance(this.secondVertex);
        if (Triangle.exist(firstSide, secondSide, thirdSide)) {
            double semiPerimeter = Triangle.semiPerimeter(firstSide, secondSide, thirdSide);
            result = sqrt(semiPerimeter) * sqrt(semiPerimeter - firstSide)
                    * sqrt(semiPerimeter - secondSide)
                    * sqrt(semiPerimeter - thirdSide);
        }
        return result;
    }

    /**
     * Method checks if triangle which
     * sides length is:
     * @param firstSide - length of the first side of the triangle
     * @param secondSide - length of the second side of the triangle
     * @param thirdSide - length of the third side of the triangle
     * @return true - if triangle exist
     *         false - if triange not exist
     */
    public static boolean exist(double firstSide, double secondSide, double thirdSide) {
        return  (firstSide < secondSide + thirdSide) &&
                (secondSide < firstSide + thirdSide) &&
                (thirdSide < firstSide + secondSide);
    }

    /**
     * Method return semi-perimeter of
     * the triangle which sides length is:
     * @param firstSide - length of the first side of the triangle
     * @param secondSide - length of the second side of the triangle
     * @param thirdSide - length of the third side of the triangle
     * @return semi-perimeter
     *         of the triangle
     */
    public static double semiPerimeter(double firstSide, double secondSide, double thirdSide) {
        return (firstSide + secondSide + thirdSide) / 2;
    }
}
