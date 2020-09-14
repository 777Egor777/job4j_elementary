package ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.MultiMax;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenFirstMax() {
        assertThat(
                new MultiMax().max(99, 32, 73),
                is(99)
        );
    }

    @Test
    public void whenSecondMax() {
        assertThat(
                new MultiMax().max(99, 132, 73),
                is(132)
        );
    }

    @Test
    public void whenThirdMax() {
        assertThat(
                new MultiMax().max(99, 32, 373),
                is(373)
        );
    }

    @Test
    public void whenAllEquals() {
        assertThat(
                new MultiMax().max(992, 992, 992),
                is(992)
        );
    }
}