package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] inputBoard = {{' ', ' ', ' '},
                               {'X', 'X', 'X'},
                               {' ', ' ', ' '}};
        int inputRow = 1;
        boolean result = MatrixCheck.monoHorizontal(inputBoard, inputRow);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenHasMonoHorizontalx2() {
        char[][] inputBoard = {{' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X'},
                {' ', ' ', ' ', ' '}};
        int inputRow = 1;
        boolean result = MatrixCheck.monoHorizontal(inputBoard, inputRow);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenHasMonoHorizontalx3() {
        char[][] inputBoard = {{' ', ' ', ' '},
                {'X', 'X', ' '},
                {' ', ' ', ' '}};
        int inputRow = 1;
        boolean result = MatrixCheck.monoHorizontal(inputBoard, inputRow);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void whenHasMonoHorizontalx4() {
        char[][] inputBoard = {{' ', ' '},
                {'X', 'X'},
                {' ', ' '}};
        int inputRow = 1;
        boolean result = MatrixCheck.monoHorizontal(inputBoard, inputRow);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void monoVertical() {
        char[][] inputBoard = {{' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', 's', 'X'}};
        int inputColumn = 2;
        boolean result = MatrixCheck.monoVertical(inputBoard, inputColumn);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void monoVerticalx2() {
        char[][] inputBoard = {{' ', ' ', 'X'},
                    {' ', ' ', 'X'},
                    {' ', 's', 's'}};
        int inputColumn = 2;
        boolean result = MatrixCheck.monoVertical(inputBoard, inputColumn);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void monoVerticalx3() {
        char[][] inputBoard = {{' ', ' ', 'X'},
                {' ', ' ', 'X'}};
        int inputColumn = 2;
        boolean result = MatrixCheck.monoVertical(inputBoard, inputColumn);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void monoVerticalx4() {
        char[][] inputBoard = {{'X', ' ', 'X'},
                {'X', ' ', 'X'},
                {'X', 's', 'X'},
                {'X', 's', 'X'}};
        int inputColumn = 0;
        boolean result = MatrixCheck.monoVertical(inputBoard, inputColumn);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void whenDiagonal() {
        char[][] input = {{'X', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', 'S'}};
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X', 'X', 'S'};
        assertThat(result, is(expected));
    }

    @Test
    public void whenDataMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataHMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }
}