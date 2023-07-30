package JobFinal.calculator;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber() {
        this.realPart = 0;
        this.imaginaryPart = 0;
    }

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if(realPart < 0){
            result.append(String.format("(%.1f)", realPart));
        }else{
            result.append(String.format("%.1f", realPart));
        }

        if(imaginaryPart > 0){
            result.append(String.format("+%.1fi", imaginaryPart));
        }else{
            result.append(String.format("%.1fi", imaginaryPart));
        }

        return result.toString();
    }
}
