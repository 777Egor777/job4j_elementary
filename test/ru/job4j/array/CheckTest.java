package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class CheckTest {

    @Test
    public void whenAllFalse() {
        boolean[] input = {false};
        boolean result = Check.mono(input);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenAllFalse2() {
        boolean[] input = {false, false};
        boolean result = Check.mono(input);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenAllFalse3() {
        boolean[] input = {false, false, false};
        boolean result = Check.mono(input);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenAllFalse4() {
        boolean[] input = {false, false, false, false};
        boolean result = Check.mono(input);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenAllTrue() {
        boolean[] input = {true};
        boolean result = Check.mono(input);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenAllTrue2() {
        boolean[] input = {true, true};
        boolean result = Check.mono(input);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenAllTrue3() {
        boolean[] input = {true, true, true};
        boolean result = Check.mono(input);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenAllTrue4() {
        boolean[] input = {true, true, true, true};
        boolean result = Check.mono(input);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenAllTrue5() {
        boolean[] input = {true, true, true, true, true};
        boolean result = Check.mono(input);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenTrueAndFalse() {
        boolean[] input = {true, false, true, true};
        boolean result = Check.mono(input);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void whenTrueAndFalse2() {
        boolean[] input = {false, false, true, true};
        boolean result = Check.mono(input);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void whenTrueAndFalse3() {
        boolean[] input = {true, false};
        boolean result = Check.mono(input);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void whenTrueAndFalse4() {
        boolean[] input = {false, true};
        boolean result = Check.mono(input);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void whenTrueAndFalse5() {
        boolean[] input = {true, true, true, true, false};
        boolean result = Check.mono(input);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void whenTrueAndFalse6() {
        boolean[] input = {false, false, false, false, false, false, true, false, false};
        boolean result = Check.mono(input);
        boolean expected = false;
        assertThat(result, is(expected));
    }
}