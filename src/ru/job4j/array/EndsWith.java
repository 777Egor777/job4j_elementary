package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        if (postfix.length > word.length) {
            result = false;
        } else {
            for(int index = 0; index < postfix.length; ++index) {
                if (postfix[index] != word[word.length - postfix.length + index]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
