package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.Square;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SquareTest {

    @Test
    public void whenBoundIs3() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = {0, 1, 4};
        assertThat(result, is(expected));
    }

    @Test
    public void whenBoundIs5() {
        int bound = 5;
        int[] result = Square.calculate(bound);
        int[] expected = {0, 1, 4, 9, 16};
        assertThat(result, is(expected));
    }
}