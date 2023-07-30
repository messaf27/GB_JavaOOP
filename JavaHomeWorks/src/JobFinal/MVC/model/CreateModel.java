package JobFinal.MVC.model;

import JobFinal.calculator.Calculator;
import JobFinal.calculator.ComplexNumber;
import JobFinal.logout.LogInterface;

public abstract class CreateModel extends Model{
    private LogInterface logger;

    @Override
    public void setCalculator(Calculator calculator) {
        super.setCalculator(calculator);
    }

    public CreateModel() {
        this.logger = null;
    }

    public CreateModel(Calculator calculator) {
        super(calculator);
    }

    @Override
    public ComplexNumber getAddComplex(ComplexNumber one, ComplexNumber two) {
        return super.getAddComplex(one, two);
    }

    @Override
    public double getAddNumber(double one, double two) {
        return super.getAddNumber(one, two);
    }

    @Override
    public ComplexNumber getMultiplyComplex(ComplexNumber one, ComplexNumber two) {
        return super.getMultiplyComplex(one, two);
    }

    @Override
    public double getMultiplyNumber(double one, double two) {
        return super.getMultiplyNumber(one, two);
    }

    @Override
    public ComplexNumber getDivideComplex(ComplexNumber one, ComplexNumber two) {
        return super.getDivideComplex(one, two);
    }

    @Override
    public double getDivideNumber(double one, double two) {
        return super.getDivideNumber(one, two);
    }

    public CreateModel(LogInterface logger) {
        this.logger = logger;
    }


}
