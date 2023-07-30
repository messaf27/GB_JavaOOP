package JobFinal.MVC.viewer;

import JobFinal.calculator.ComplexNumber;

public interface View {
    ComplexNumber getComplexNumber();
    double getNumber();
    void displayMenu(String title, Menu menu);
    int getSelectedMenuItem();
    int getInputIndex(String title);
    void displayText(String text);
    void exit();
}
