package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void sqr() {
        double in = 2.0;
        double expected = 4.0;
        double out = Point.sqr(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceTest1() {
        double expected = 1.0;
        double out = Point.distance(0, 0, 0, 1);

        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceTest2() {
        double expected = 1.0;
        double out = Point.distance(0, 0, 1, 0);

        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceTest3() {
        double expected = Math.sqrt(2);
        double out = Point.distance(0, 0, 1, 1);

        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceTest4() {
        double expected = Math.sqrt(8);
        double out = Point.distance(0, 0, 2, 2);

        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceTest5() {
        double expected = 5.0;
        double out = Point.distance(7, 9, 4, 13);

        Assert.assertEquals(expected, out, 0.01);
    }
}