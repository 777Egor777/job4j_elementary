package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.loop.CheckPrimeNumber;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        boolean rsl = CheckPrimeNumber.check(5);
        boolean expected = true;
        assertThat(rsl, is(expected));
    }

    @Test
    public void when4() {
        boolean rsl = CheckPrimeNumber.check(4);
        boolean expected = false;
        assertThat(rsl, is(expected));
    }

    @Test
    public void when1() {
        boolean rsl = CheckPrimeNumber.check(1);
        boolean expected = false;
        assertThat(rsl, is(expected));
    }

    @Test
    public void when7() {
        boolean rsl = CheckPrimeNumber.check(7);
        boolean expected = true;
        assertThat(rsl, is(expected));
    }

    @Test
    public void when33() {
        boolean rsl = CheckPrimeNumber.check(33);
        boolean expected = false;
        assertThat(rsl, is(expected));
    }

    @Test
    public void when141() {
        boolean rsl = CheckPrimeNumber.check(141);
        boolean expected = false;
        assertThat(rsl, is(expected));
    }

    @Test
    public void when29() {
        boolean rsl = CheckPrimeNumber.check(29);
        boolean expected = true;
        assertThat(rsl, is(expected));
    }
}