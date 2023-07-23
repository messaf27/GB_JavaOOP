package Lesson_04;

import java.util.List;

public class Calculator {
    public double sum(List<? extends Number> numbers){ // Любой тип наследующийся от Number
        double s = 0.0;
        for (Number number: numbers) {
            s += number.doubleValue();
        }
        return s;
    }
}
