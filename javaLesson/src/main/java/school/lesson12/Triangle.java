package school.lesson12;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Slf4j
public class Triangle {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        log.info("Triangle with sides {}, {}, {} is created", a, b, c);
    }

    public Triangle() {

    }

    public void setSidesOfTriangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        log.info("Sides of triangle are set to {}, {}, {}", a, b, c);
    }

    public double calculateSquareOfTriangle() {
        if (a > 0 && b > 0 && c > 0) {
            if (isTriangle()) {
                double pp = (a + b + c) / 2.0;
                double dSquare = Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
                int iSquare = (int) Math.round(dSquare);
                log.info("Half of perimeter is {}", pp);
                log.info("Square of triangle {} is rounded to {}", dSquare, iSquare);
                return (int) Math.round(Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c)));
            } else {
                log.warn("Not a triangle, sum of two sides more than another one: {}, {}, {}", a, b, c);
                throw new ArithmeticException("Не является треугольником");
            }
        } else {
            log.error("One or more sides are incorrect {}, {}, {}", a, b, c);
            throw new ArithmeticException("Одна или несколько сторон некорректны");
        }
    }

    public boolean isTriangle() {
        log.info("Check if triangle with sides {}, {}, {} can exist", a, b, c);
        return (isSidesCorrect() && ((a + b > c) && (a + c > b) && (b + c > a)));
    }

    public boolean isSidesCorrect() {
        log.info("Check if sides of triangle correct and more than 0: {}, {}, {}", a, b, c);
        return (a > 0 && b > 0 && c > 0);
    }
}
