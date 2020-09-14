package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.FindLoop;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas7Then1() {
        FindLoop findLoop = new FindLoop();
        int[] inputArray = {5, 7, 123312, 213213, 12312, 7, 11};
        int value = 7;
        int result = findLoop.indexOf(inputArray, value);
        int expected = 1;
        assertThat(result, is(expected));
    }

    @Test
    public void whenArrayHasNoThisElement() {
        FindLoop findLoop = new FindLoop();
        int[] inputArray = {5, 7, 123312, 213213, 12312, 7, 11};
        int value = -11;
        int result = findLoop.indexOf(inputArray, value);
        int expected = -1;
        assertThat(result, is(expected));
    }

    @Test
    public void whenArrayHas7Then1xx() {
        FindLoop findLoop = new FindLoop();
        int[] inputArray = {5, 7, 123312, 213213, 12312, 7, 11};
        int value = 7;
        int start = 0;
        int finish = 2;
        int result = findLoop.indexOf(inputArray, value, start, finish);
        int expected = 1;
        assertThat(result, is(expected));
    }

    @Test
    public void whenArrayHas7Then1xxx() {
        FindLoop findLoop = new FindLoop();
        int[] inputArray = {5, 7, 123312, 213213, 12312, 7, 11};
        int value = 7;
        int start = 2;
        int finish = 4;
        int result = findLoop.indexOf(inputArray, value, start, finish);
        int expected = -1;
        assertThat(result, is(expected));
    }
}