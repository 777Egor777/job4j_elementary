package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.Matrix;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {

    @Test
    public void when2On2() {
        Matrix matrix = new Matrix();
        int[][] result = matrix.multiple(2);
        int[][] expected = {{1, 2},
                            {2, 4}};
        assertThat(result, is(expected));
    }

    @Test
    public void when3On3() {
        Matrix matrix = new Matrix();
        int[][] result = matrix.multiple(3);
        int[][] expected = {{1, 2, 3},
                            {2, 4, 6},
                            {3, 6, 9}};
        assertThat(result, is(expected));
    }
}