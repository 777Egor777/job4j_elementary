package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.ArrayChar;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {

    @Test
    public void whenTrue() {
        char[] inputWord = {'E', 'g', 'o', 'r'};
        char[] inputPref = {'E', 'g'};
        boolean result = ArrayChar.startsWith(inputWord, inputPref);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenFalse() {
        char[] inputWord = {'E', 'g', 'o', 'r'};
        char[] inputPref = {'E', 'h'};
        boolean result = ArrayChar.startsWith(inputWord, inputPref);
        boolean expected = false;
        assertThat(result, is(expected));
    }
}