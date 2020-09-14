package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.EndsWith;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class EndsWithTest {
    @Test
    public void whenTrue() {
        char[] inputWord = {'H', 'e', 'l', 'l', 'o'};
        char[] inputPostfix = {'l', 'o'};
        boolean result = EndsWith.endsWith(inputWord, inputPostfix);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenFalse() {
        char[] inputWord = {'H', 'e', 'l', 'l', 'o'};
        char[] inputPostfix = {'l', 'a'};
        boolean result = EndsWith.endsWith(inputWord, inputPostfix);
        boolean expected = false;
        assertThat(result, is(expected));
    }
}