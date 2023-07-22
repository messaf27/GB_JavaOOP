package Lesson_04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        List<Integer> listInt = new ArrayList<>();
        List<Double> listDoub = new ArrayList<>();
        List<Number> listNumber = new ArrayList<>();

        for(int i = 0; i < 101; i++)
        {
            listInt.add(i);
            listDoub.add(((double) i));
            listNumber.add(i);
        }

        System.out.println("calc.sum(listNumber) = " + calc.sum(listNumber));
        System.out.println("calc.sum(listDoub) = " + calc.sum(listDoub));
    }
}
