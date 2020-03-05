package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class MatrixCheckTest {

    @Test
    public void monoHorizontal() {
        char[][] inputBoard = {{' ', ' ', ' '},
                               {'X', 'X', 'X'},
                               {' ', ' ', ' '}};
        int inputRow = 1;
        boolean result = MatrixCheck.monoHorizontal(inputBoard, inputRow);
        boolean expected = true;
        assertThat(result, is(expected));
    }
}