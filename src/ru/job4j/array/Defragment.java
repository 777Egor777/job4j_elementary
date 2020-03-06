package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; ++index) {
            if (array[index] == null) {
                int point = index;

                while(point < array.length && array[point] == null) {
                    point++;
                }

                if (point == array.length) {
                    break;
                } else {
                    String temp = array[index];
                    array[index] = array[point];
                    array[point] = temp;
                }
            }
        }
        return array;
    }
}
