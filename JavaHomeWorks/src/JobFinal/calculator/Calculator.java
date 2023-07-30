package JobFinal.calculator;

//public interface Calculator {
//    ComplexNumber add(ComplexNumber oneNum, ComplexNumber twoNum);
//    ComplexNumber multiply(ComplexNumber oneNum, ComplexNumber twoNum);
//    ComplexNumber divide(ComplexNumber oneNum, ComplexNumber twoNum);
//}

public interface Calculator<N> {
    N add(N oneNum, N twoNum);
    N multiply(N oneNum, N twoNum);
    N divide(N oneNum, N twoNum);
}
