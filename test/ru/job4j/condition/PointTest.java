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
    public void distance() {
        double[] expected = {1.0, 1.0, Math.sqrt(2), Math.sqrt(8), 5.0};
        double[] out = {Point.distance(0, 0, 0, 1),
                        Point.distance(0, 0, 1, 0),
                        Point.distance(0, 0, 1, 1),
                        Point.distance(0, 0, 2, 2),
                        Point.distance(7, 9, 4, 13)};
        for(int i = 0; i < expected.length; ++i) {
            Assert.assertEquals(expected[i], out[i], 0.01);
        }
    }
}