package JobFinal.Calculator;

public class ComplexCalculator implements Calculator<ComplexNumber> {
    public ComplexCalculator() {
    }

    @Override
    public ComplexNumber add(ComplexNumber oneNum, ComplexNumber twoNum) {
        ComplexNumber result = null;

        double realPart = oneNum.getRealPart() + twoNum.getRealPart();

        double imaginaryPart = oneNum.getImaginaryPart() + twoNum.getImaginaryPart();

        result = new ComplexNumber(realPart, imaginaryPart);

        System.out.println("Add result: " + result.getRealPart() + " + " +
            result.getImaginaryPart() + "i");

        return result;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber oneNum, ComplexNumber twoNum) {
        ComplexNumber result = null;

        double realPart = oneNum.getRealPart() * twoNum.getRealPart() -
                oneNum.getImaginaryPart() * twoNum.getImaginaryPart();

        double imaginaryPart = oneNum.getRealPart() * twoNum.getRealPart() +
                oneNum.getImaginaryPart() * twoNum.getImaginaryPart();

        result = new ComplexNumber(realPart, imaginaryPart);

        System.out.println("Multiply result: " + result.getRealPart() + " + " +
                result.getImaginaryPart() + "i");

        return result;
    }

    @Override
    public ComplexNumber divide(ComplexNumber oneNum, ComplexNumber twoNum) {
        ComplexNumber result = null;

        double denominator = twoNum.getRealPart() * twoNum.getRealPart() +
                twoNum.getImaginaryPart() * twoNum.getImaginaryPart();

        double realPart = (oneNum.getRealPart() * twoNum.getRealPart() +
                oneNum.getImaginaryPart() * twoNum.getImaginaryPart()) / denominator;

        double imaginaryPart = (oneNum.getImaginaryPart() * twoNum.getRealPart() -
                twoNum.getRealPart() * twoNum.getImaginaryPart()) / denominator;

        result = new ComplexNumber(realPart, imaginaryPart);

        System.out.println("Divide result: " + result.getRealPart() + " + " +
                result.getImaginaryPart() + "i");

        return result;
    }
}
