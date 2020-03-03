package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class MortgageTest {

    @Test
    public void when1Year() {
        Mortgage mortgage = new Mortgage();
        int rsl = mortgage.year(1000, 1200, 1);
        int expected = 1;
        assertThat(rsl, is(expected));
    }

    @Test
    public void when2Year() {
        Mortgage mortgage = new Mortgage();
        int rsl = mortgage.year(100, 120, 50);
        int expected = 2;
        assertThat(rsl, is(expected));
    }
}