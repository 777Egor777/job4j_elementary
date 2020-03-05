package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class TurnTest {

    @Test
    public void whenArrayLengthEven() {
        int[] input = {1, 2, 3, 4};
        int[] result = Turn.back(input);
        int[] expected = {4, 3, 2, 1};
        assertThat(result, is(expected));
    }

    @Test
    public void whenArrayLengthOdd() {
        int[] input = {1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] expected = {5, 4, 3, 2, 1};
        assertThat(result, is(expected));
    }
}