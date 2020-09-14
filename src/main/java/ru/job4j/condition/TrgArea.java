package ru.job4j.condition;
import static java.lang.Math.*;

public class TrgArea {
    public static double area(double firstSide, double secondSide, double thirdSide) {
        double p = (firstSide + secondSide + thirdSide) / 2.0;
        return sqrt(p) * sqrt(p - firstSide) * sqrt(p - secondSide) * sqrt(p - thirdSide);
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
