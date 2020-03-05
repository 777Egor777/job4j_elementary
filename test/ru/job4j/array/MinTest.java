package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class MinTest {
    @Test
    public void whenFirstMin() {
        int[] input = {0, 5, 10};
        int result = Min.findMin(input);
        int expected = 0;
        assertThat(result, is(expected));
    }

    @Test
    public void whenMiddleMin() {
        int[] input = {10, 3, 5};
        int result = Min.findMin(input);
        int expected = 3;
        assertThat(result, is(expected));
    }

    @Test
    public void whenLastMin() {
        int[] input = {10, 5, 2};
        int result = Min.findMin(input);
        int expected = 2;
        assertThat(result, is(expected));
    }
}