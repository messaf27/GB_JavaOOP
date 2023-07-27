package JobFinal;

import JobFinal.Calculator.Calculator;
import JobFinal.Calculator.ComplexCalculator;
import JobFinal.Calculator.ComplexNumber;
import JobFinal.Calculator.NumberCalculator;

public class Program {
    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(8, -10);
        ComplexNumber two = new ComplexNumber(4, -5);

        Calculator<ComplexNumber> complexCalculator = new ComplexCalculator();

        complexCalculator.add(one,two);
        complexCalculator.multiply(one,two);
        complexCalculator.divide(one,two);

        Calculator<Number> numberCalculator = new NumberCalculator();

        System.out.println("numberCalculator.add(23.5,3) = " + numberCalculator.add(23.5, 3));
        System.out.println("numberCalculator.multiply(56.89,36.12) = " + numberCalculator.multiply(56.89, 36.12));
        System.out.println("numberCalculator.divide(12.8,5.8) = " + numberCalculator.divide(12.8, 5.8));
    }
}
