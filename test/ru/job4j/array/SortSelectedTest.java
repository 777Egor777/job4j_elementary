package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class SortSelectedTest {
    @Test
    public void whenSort3Elem() {
        int[] input = {8, 3, 99};
        int[] result = SortSelected.sort(input);
        int[] expected = {3, 8, 99};
        assertThat(result, is(expected));
    }

    @Test
    public void whenSort5Elem() {
        int[] input = {8, 3, 99, 22, 43};
        int[] result = SortSelected.sort(input);
        int[] expected = {3, 8, 22, 43, 99};
        assertThat(result, is(expected));
    }
}