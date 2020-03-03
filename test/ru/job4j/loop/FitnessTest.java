package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class FitnessTest {

    @Test
    public void whenIvanGreaterThanNik() {
        int rsl = Fitness.calc(95, 90);
        int expected = 0;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenIvanLessByOneThanNik() {
        int rsl = Fitness.calc(90, 95);
        int expected = 1;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenIvanLessByFewThanNik() {
        int rsl = Fitness.calc(50, 90);
        int expected = 2;
        assertThat(rsl, is(expected));
    }
}