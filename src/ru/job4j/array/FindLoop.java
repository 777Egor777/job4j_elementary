package ru.job4j.array;

public class FindLoop {
    public int indexOf(int[] data, int el) {
        int result = -1; // if there is no element el in array data, then return -1
        for (int index = 0; index < data.length; ++index) {
            if (data[index] == el) {
                result = index;
                break;
            }
        }
        return result;
    }

    public int indexOf(int[] data, int el, int start, int finish) {
        int result = -1; // if there is no element el in array data, then return -1
        for (int index = start; index < finish; ++index) {
            if (data[index] == el) {
                result = index;
                break;
            }
        }
        return result;
    }
}
