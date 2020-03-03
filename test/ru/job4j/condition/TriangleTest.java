package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class TriangleTest {
    @Test
    public void whenExist() {
        assertThat(Triangle.exist(2.0, 2.0, 2.0),
                   is(true)
            );
    }

    @Test
    public void whenNotExist() {
        assertThat(Triangle.exist(5.0, 2.0, 2.0),
                is(false)
        );
    }
}