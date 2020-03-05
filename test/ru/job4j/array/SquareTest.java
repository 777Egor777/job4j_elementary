package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class SquareTest {

    @Test
    public void WhenBoundIs3() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = {0, 1, 4};
        assertThat(result, is(expected));
    }

    @Test
    public void WhenBoundIs5() {
        int bound = 5;
        int[] result = Square.calculate(bound);
        int[] expected = {0, 1, 4, 9, 16};
        assertThat(result, is(expected));
    }
}