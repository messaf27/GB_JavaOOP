package JobFinal.calculator;

import JobFinal.calculator.Calculator;
import JobFinal.calculator.ComplexNumber;
import JobFinal.logout.LogInterface;

public class CreateLogableCalculator implements Calculator {
    private LogInterface logger;
    Calculator<ComplexNumber> decorated;

    public CreateLogableCalculator(LogInterface logger, Calculator<ComplexNumber> decorated) {
        this.logger = logger;
        this.decorated = decorated;
    }

    @Override
    public Object add(Object oneNum, Object twoNum) {
        logger.log(String.format("Сложение чисел %s и %s", oneNum, twoNum));
        return decorated.add((ComplexNumber) oneNum, (ComplexNumber) twoNum);
    }

    @Override
    public Object multiply(Object oneNum, Object twoNum) {

        logger.log(String.format("Умножение чисел %s и %s", oneNum, twoNum));
        return decorated.add((ComplexNumber) oneNum, (ComplexNumber) twoNum);
    }

    @Override
    public Object divide(Object oneNum, Object twoNum) {
        logger.log(String.format("Деление чисел %s и %s", oneNum, twoNum));
        return decorated.add((ComplexNumber) oneNum, (ComplexNumber) twoNum);
    }
}
