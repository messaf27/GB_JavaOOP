package JobFinal.Calculator;

import JobFinal.Calculator.Calculator;

public class NumberCalculator implements Calculator<Number> {
    @Override
    public Number add(Number oneNum, Number twoNum) {
        return oneNum.doubleValue() + twoNum.doubleValue();
    }

    @Override
    public Number multiply(Number oneNum, Number twoNum) {
        return oneNum.doubleValue() * twoNum.doubleValue();
    }

    @Override
    public Number divide(Number oneNum, Number twoNum) {
        return oneNum.doubleValue() / twoNum.doubleValue();
    }


}
