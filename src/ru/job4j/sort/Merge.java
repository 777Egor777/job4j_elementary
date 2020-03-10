package ru.job4j.sort;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        //First Array Pointer
        int i = 0;
        //Second Array Pointer
        int j = 0;
        //Position if rsl array
        int position = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                rsl[position] = left[i];
                i++;
            } else {
                rsl[position] = right[j];
                j++;
            }
            position++;
        }

        while (i < left.length) {
            rsl[position] = left[i];
            i++;
            position++;
        }

        while (j < right.length) {
            rsl[position] = right[j];
            j++;
            position++;
        }

        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
    }
}
