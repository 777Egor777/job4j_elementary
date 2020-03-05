package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};

        for (int index1 = 0; index1 < array.length; index1++) {
            for (int index2 = index1 + 1; index2 < array.length; index2++) {
                if (array[index2] < array[index1]) {
                    int temp = array[index1];
                    array[index1] = array[index2];
                    array[index2] = temp;
                }
            }
        }

        for (int index = 0; index < array.length; ++index) {
            System.out.println(array[index]);
        }
    }
}
