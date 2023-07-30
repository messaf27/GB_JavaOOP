package JobFinal.MVC.controller;

import JobFinal.MVC.model.Model;
import JobFinal.MVC.viewer.Menu;
import JobFinal.MVC.viewer.MenuItem;
import JobFinal.MVC.viewer.View;
import JobFinal.calculator.ComplexNumber;


import javax.swing.*;
import java.util.Arrays;

public class Controller {
    private Model model;
    private View viewer;

    public Controller(Model model, View viewer) {
        this.model = model;
        this.viewer = viewer;
    }

    private void loopProcess() {

    }

    public void run(){
        String titleApp = "Приложение Калькулятор комплексных чмсел 1.0";

        Menu mainMenu = new Menu(Arrays.asList(
                new MenuItem("Сложение", 1),
                new MenuItem("Умножение", 2),
                new MenuItem("Деление", 3),
                new MenuItem("Выйти из приложения", 4)
        ));

        viewer.displayText(titleApp);

        while (true){
            viewer.displayMenu("Главное меню", mainMenu);

            int selectedItem = viewer.getSelectedMenuItem();
            // Exit program item menu
            if(selectedItem == 4) {
                this.exit();
                break;
            }else if (selectedItem > 0 && selectedItem < mainMenu.getNumItems()) {
                switch (selectedItem) {
                    case 1 -> {
                        viewer.displayText("Введите первое ");
                        ComplexNumber num1 =  viewer.getComplexNumber();
                        viewer.displayText("Введите второе ");
                        ComplexNumber num2 =  viewer.getComplexNumber();
                        ComplexNumber result = model.getAddComplex(num1, num2);
                        viewer.displayText(String.format("Результат сложения %s\n", result));
                    }
                    case 2 -> {
                        viewer.displayText("Введите первое ");
                        ComplexNumber num1 =  viewer.getComplexNumber();
                        viewer.displayText("Введите второе ");
                        ComplexNumber num2 =  viewer.getComplexNumber();
                        ComplexNumber result = model.getMultiplyComplex(num1, num2);
                        viewer.displayText(String.format("Результат множения %s\n", result));
                    }
                    case 3 -> {
                        viewer.displayText("Введите первое ");
                        ComplexNumber num1 =  viewer.getComplexNumber();
                        viewer.displayText("Введите второе ");
                        ComplexNumber num2 =  viewer.getComplexNumber();
                        ComplexNumber result = model.getDivideComplex(num1, num2);
                        viewer.displayText(String.format("Результат деления %s\n", result));
                    }
                }
            }else{
                viewer.displayText(String.format("Пункт меню № %d не найден, повторите ввод!", selectedItem));
            }
        }
    }

    public void exit(){
        viewer.exit();
    }
}
