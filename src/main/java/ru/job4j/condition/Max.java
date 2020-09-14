package ru.job4j.condition;

/**
 * Class consists methods to
 * calculate maximum of two
 * or three numbers
 * @author Geraskin Yegor (yegeraskin13@gmail.com)
 */
public class Max {
    /**
     * Method calculate maximum of
     * two numbers
     * @param left - first number
     * @param right - second number
     * @return maximum of two numbers
     */
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    /**
     * Method calculate maximum
     * of three numbers
     * @param first - first nubmer
     * @param second - second number
     * @param third - third number
     * @return maximum of three numbers
     */
    public static int max(int first, int second, int third) {
        int result = Max.max(first, second);
        result = Max.max(result, third);
        return result;
    }

    /**
     * Method calculate maximum
     * of four numbers
     * @param first - first nubmer
     * @param second - second number
     * @param third - third number
     * @param fourth - third number
     * @return maximum of these four numbers
     */
    public static int max(int first, int second, int third, int fourth) {
        int result = Max.max(first, second, third);
        result = Max.max(result, fourth);
        return result;
    }
}
