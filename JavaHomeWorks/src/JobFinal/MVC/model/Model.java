package JobFinal.MVC.model;

import JobFinal.calculator.*;
import JobFinal.logout.ConsoleLogger;

public class Model {
//    private Calculator complexCalculator = new ComplexCalculator();
//    private Calculator doubleCalculator = new NumberCalculator();

    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public Model() {

//        this.calculator = new ComplexCalculator();

        this.calculator = new CreateLogableCalculator(
                new ConsoleLogger(), new ComplexCalculator());
    }

    public Model(Calculator calculator) {
        this.calculator = calculator;
    }

    public ComplexNumber getAddComplex(ComplexNumber one, ComplexNumber two){
       return (ComplexNumber) calculator.add(one, two);
    }

    public double getAddNumber(double one, double two) {
        return (double) calculator.add(one, two);
    }

    public ComplexNumber getMultiplyComplex(ComplexNumber one, ComplexNumber two) {
        return (ComplexNumber) calculator.multiply(one, two);
    }

    public double getMultiplyNumber(double one, double two) {
        return (double) calculator.multiply(one, two);
    }

    public ComplexNumber getDivideComplex(ComplexNumber one, ComplexNumber two) {
        return (ComplexNumber) calculator.divide(one, two);
    }

    public double getDivideNumber(double one, double two) {
        return (double) calculator.divide(one, two);
    }
}
