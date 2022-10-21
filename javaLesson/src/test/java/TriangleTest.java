import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import school.lesson12.Triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TriangleTest {

    private static Triangle triangle;

    @BeforeAll
    public static void createTriangle() {
        triangle = new Triangle();
    }

    @ParameterizedTest
    @DisplayName("Позитивная проверка метода является ли треугольником")
    @ValueSource(doubles = {3.5, 7.0, 5.9})
    public void positiveIsTriangleTest(double c) {
        triangle.setSidesOfTriangle(5.6, 3, c);
        assertTrue(triangle.isTriangle(), "Не является треугольником");
    }

    @ParameterizedTest
    @DisplayName("Негативная проверка метода является ли треугольником")
    @ValueSource(doubles = {100, 299.99, 0.1})
    public void negativeIsTriangleTest(double c) {
        triangle.setSidesOfTriangle(5.6, 3, c);
        assertFalse(triangle.isTriangle(), "Яявляется треугольником");
    }

    @ParameterizedTest
    @DisplayName("Проверка метода на корректность сторон с не корректными сторонамим")
    @ValueSource(doubles = {0, -500, -0.1, 0.0})
    public void negativeIsSidesCorrectTest(double c) {
        triangle.setSidesOfTriangle(5.6, 3, c);
        assertFalse(triangle.isSidesCorrect(), "Стороны не корректным");
        triangle.setSidesOfTriangle(c, c, 1.1);
        assertFalse(triangle.isSidesCorrect(), "Стороны не корректным");
        triangle.setSidesOfTriangle(c, c, c);
        assertFalse(triangle.isSidesCorrect(), "Стороны не корректным");
    }

    @ParameterizedTest
    @DisplayName("Проверка метода на корректность сторон с корректными сторонамим")
    @ValueSource(doubles = {0.1, 1000, 1, Double.MAX_VALUE})
    public void positiveIsSidesCorrectTest(double c) {
        triangle.setSidesOfTriangle(5.6, 3, c);
        assertTrue(triangle.isSidesCorrect(), "Стороны не корректным");
        triangle.setSidesOfTriangle(c, c, 1.1);
        assertTrue(triangle.isSidesCorrect(), "Стороны не корректным");
        triangle.setSidesOfTriangle(c, c, c);
        assertTrue(triangle.isSidesCorrect(), "Стороны не корректным");
    }

    @Test
    @DisplayName("Проверка вычисления площади корректного треугольника с корректными сторонами")
    public void calculateSquareOfCorrectTriangle() {
        triangle.setSidesOfTriangle(99.5, 60, 77);
        assertEquals(2308, triangle.calculateSquareOfTriangle(), "Неверная площадь");
        triangle.setSidesOfTriangle(1.1, 2.2, 3.2);
        assertEquals(1, triangle.calculateSquareOfTriangle());
    }

    @Test
    @DisplayName("Проверка вычисления площади с невалидными сторонами")
    public void calculateSquareOfIncorrectSidesTriangle() {
        triangle.setSidesOfTriangle(111, 10, 0);
        Throwable exception = assertThrows(ArithmeticException.class, triangle::calculateSquareOfTriangle);
        assertEquals("Одна или несколько сторон некорректны", exception.getMessage());

        triangle.setSidesOfTriangle(-1,0.0,100);
        exception = assertThrows(ArithmeticException.class, triangle::calculateSquareOfTriangle);
        assertEquals("Одна или несколько сторон некорректны", exception.getMessage());

        triangle.setSidesOfTriangle(-1,0.0,-9);
        exception = assertThrows(ArithmeticException.class, triangle::calculateSquareOfTriangle);
        assertEquals("Одна или несколько сторон некорректны", exception.getMessage());
    }

    @Test
    @DisplayName("Проверка вычисления площади со сторонами, которые не могут образовать треугольник")
    public void calculateSquareOfIncorrectTriangle() {
        triangle.setSidesOfTriangle(2, 3, 7);
        Throwable exception = assertThrows(ArithmeticException.class, triangle::calculateSquareOfTriangle);
        assertEquals("Не является треугольником", exception.getMessage());
    }
}
