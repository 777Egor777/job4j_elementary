package ru.job4j.array;

public class BarleyBreak {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int num = 0;
        for (int index = 0; index < 3; ++index) {
            for(int index2 = 0; index2 < 3; ++index2) {
                array[index][index2] = ++num;
            }
        }
    }
}
