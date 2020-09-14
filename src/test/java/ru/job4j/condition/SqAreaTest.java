package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.SqArea;

public class SqAreaTest {

    @Test
    public void sqr() {
        double in = 3;
        double expected = 9;
        double out = SqArea.sqr(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void squareTest1() {
        double expected = 1;
        double out = SqArea.square(4, 1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void squareTest2() {
        double expected = 0.25;
        double out = SqArea.square(2, 1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void height() {
        double expected = 1;
        double out = SqArea.height(4, 1);
        Assert.assertEquals(expected, out, 0.01);
    }
}