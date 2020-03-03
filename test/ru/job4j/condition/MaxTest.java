package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        assertThat(Max.max(1, 2),
                   is(2));
    }

    @Test
    public void whenMax7To4Then7() {
        assertThat(Max.max(7, 4),
                is(7));
    }

    @Test
    public void whenMax33To33Then33() {
        assertThat(Max.max(33, 33),
                is(33));
    }
}