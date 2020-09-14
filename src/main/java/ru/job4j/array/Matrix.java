package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] result = new int[size][size];
        for (int index1 = 0; index1 < size; index1++) {
            for (int index2 = 0; index2 < size; ++index2) {
                result[index1][index2] = (index1 + 1) * (index2 + 1);
            }
        }
        return result;
    }
}
