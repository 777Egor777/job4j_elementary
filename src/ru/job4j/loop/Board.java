package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int verticalIndex = 0; verticalIndex < height; ++verticalIndex) {
            for (int horizontalIndex = 0; horizontalIndex < width; ++horizontalIndex) {
                int sumOfIndex = verticalIndex + horizontalIndex;
                char symbol = (sumOfIndex % 2 == 1) ? ' ' : 'X';
                System.out.print(symbol);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Board.paint(3, 3);
        System.out.println("");
        Board.paint(4, 4);
        System.out.println("");
        Board.paint(5, 4);
    }
}
