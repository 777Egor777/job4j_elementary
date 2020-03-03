package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for(int index = start; index <= finish; ++index) {
            sum += index;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for(int index = start; index <= finish; index++) {
            if (index % 2 != 0) {
                continue;
            }
            sum = sum + index;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(1, 4));
        System.out.println(sum(13, 99));
        System.out.println(sum(9999, 11231));
        System.out.println(sum(122, 1222));
        System.out.println(sum(1, -11));

        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));
        System.out.println(sumByEven(1, 4));
        System.out.println(sumByEven(13, 99));
        System.out.println(sumByEven(9999, 11231));
        System.out.println(sumByEven(122, 1222));
        System.out.println(sumByEven(1, -11));
    }
}
