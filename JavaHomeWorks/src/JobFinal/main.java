package JobFinal;

import JobFinal.MVC.controller.Controller;
import JobFinal.MVC.model.Model;
import JobFinal.MVC.viewer.ConsoleViewer;
import JobFinal.MVC.viewer.View;

public class main {
    public static void main(String[] args) {
//        ComplexNumber one = new ComplexNumber(8, -10);
//        ComplexNumber two = new ComplexNumber(4, -5);
//
//        Calculator<ComplexNumber> complexCalculator = new ComplexCalculator();
//        complexCalculator.add(one, two);
//        complexCalculator.multiply(one, two);
//        complexCalculator.divide(one, two);
//
//        Calculator<Number> numberCalculator = new NumberCalculator();
//        System.out.println("numberCalculator.add(23.5,3) = " + numberCalculator.add(23.5, 3));
//        System.out.println("numberCalculator.multiply(56.89,36.12) = " + numberCalculator.multiply(56.89, 36.12));
//        System.out.println("numberCalculator.divide(12.8,5.8) = " + numberCalculator.divide(12.8, 5.8));

        View consoleViewer = new ConsoleViewer();
        Model model = new Model();
        Controller controller = new Controller(model, consoleViewer);

        controller.run();
    }
}
