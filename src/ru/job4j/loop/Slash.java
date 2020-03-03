package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        for(int row = 0; row < size; row++) {
            for(int cell = 0; cell < size; cell++) {
                boolean left = row == cell;
                boolean right = row == (size - 1 - cell);
                if (left || right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        Slash.draw(3);
        System.out.println("Draw by 5");
        Slash.draw(5);
    }
}
