package ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

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

    @Test
    public void whenThreeNumbers() {
        assertThat(Max.max(33, 33, 33),
                is(33));
    }

    @Test
    public void whenThreeNumbers2() {
        assertThat(Max.max(32, 33, 33),
                is(33));
    }

    @Test
    public void whenThreeNumbers3() {
        assertThat(Max.max(34, 33, 33),
                is(34));
    }

    @Test
    public void whenThreeNumbers4() {
        assertThat(Max.max(-100, 0, 101),
                is(101));
    }

    @Test
    public void whenThreeNumbers5() {
        assertThat(Max.max(0, 0, -1),
                is(0));
    }

    @Test
    public void whenThreeNumbers6() {
        assertThat(Max.max(-45, -4, -1),
                is(-1));
    }

    @Test
    public void whenThreeNumbers7() {
        assertThat(Max.max(-3, -2, -1),
                is(-1));
    }

    @Test
    public void max() {
        assertThat(Max.max(-3, -2, -1, 27),
                is(27));
    }
}