package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class PrimeNumberTest {
    @Test
    public void when5() {
        PrimeNumber prime = new PrimeNumber();
        int rsl = prime.calc(5);
        int expected = 3;
        assertThat(rsl, is(expected));
    }

    @Test
    public void when11() {
        PrimeNumber prime = new PrimeNumber();
        int rsl = prime.calc(11);
        int expected = 5;
        assertThat(rsl, is(expected));
    }

    @Test
    public void when2() {
        PrimeNumber prime = new PrimeNumber();
        int rsl = prime.calc(2);
        int expected = 1;
        assertThat(rsl, is(expected));
    }
}