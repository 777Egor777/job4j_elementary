package ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.Point;
import ru.job4j.condition.Triangle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        assertThat(Triangle.exist(2.0, 2.0, 2.0),
                   is(true)
            );
    }

    @Test
    public void whenNotExist() {
        assertThat(Triangle.exist(5.0, 2.0, 2.0),
                is(false)
        );
    }

    @Test
    public void area() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double out = triangle.area();
        double expected = 6;
        assertThat(out, is(expected));
    }

    @Test
    public void semiPerimeter() {
        double firstSide = 2;
        double secondSide = 3;
        double thirdSide = 4;
        double out = Triangle.semiPerimeter(firstSide, secondSide, thirdSide);
        double expected = 4.5;
        assertThat(out, is(expected));
    }

    @Test
    public void semiPerimeter2() {
        double firstSide = 5;
        double secondSide = 4;
        double thirdSide = 7;
        double out = Triangle.semiPerimeter(firstSide, secondSide, thirdSide);
        double expected = 8;
        assertThat(out, is(expected));
    }
}