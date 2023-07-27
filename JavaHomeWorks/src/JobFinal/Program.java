package JobFinal;

public class Program {
    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(8, -10);
        ComplexNumber two = new ComplexNumber(4, -5);

        ComplexCalculator calculator = new ComplexCalculator();

        calculator.add(one,two);
        calculator.multiply(one,two);
        calculator.divide(one,two);
    }
}
