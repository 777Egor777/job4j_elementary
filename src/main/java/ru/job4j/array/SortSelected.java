package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int index = 0; index < data.length; ++index) {
            int min = MinDiapason.findMin(data, index, data.length - 1);
            int indexOfMin = new FindLoop().indexOf(data, min, index, data.length - 1);
            int temp = data[index];
            data[index] = data[indexOfMin];
            data[indexOfMin] = temp;
        }
        return data;
    }
}
