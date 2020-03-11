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
        int result = left >= right ? left : right;
        return result;
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
}
