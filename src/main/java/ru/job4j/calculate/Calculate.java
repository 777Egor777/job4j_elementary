package ru.job4j.calculate;

/**
 * Class Calculate
 * @author Geraskin Egor
 */
public class Calculate {

    /**
     * Method main, entry-point of
     * the program.
     * Call echo function and print
     * the result
     * @param args - compilation args
     */
    public static void main(String[] args) {
        Calculate calc = new Calculate();
        String result = calc.echo("petr");
        System.out.println(result);
    }

    /**
     * Echo method.
     * Get string as argument,
     * concate it with literal-string
     * and return result
     * @param name - name string
     * @return modificated name string
     */
    public String echo(String name) {
        return "Hello, echo, echo : " + name;
    }
}