package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void sqr() {
        double in = 3;
        double expected = 9;
        double out = SqArea.sqr(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void square() {
        double[] expected = {1, 0.25};
        double[] out = {SqArea.square(4, 1),
                        SqArea.square(2, 1)};
        for(int i = 0; i < expected.length; ++i) {
            Assert.assertEquals(expected[i], out[i], 0.01);
        }
    }

    @Test
    public void height() {
        double[] expected = {1, 0.5};
        double[] out = {SqArea.height(4, 1),
                SqArea.height(2, 1)};
        for(int i = 0; i < expected.length; ++i) {
            Assert.assertEquals(expected[i], out[i], 0.01);
        }
    }
}