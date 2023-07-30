package JobFinal.MVC.viewer;

import JobFinal.calculator.ComplexNumber;

import java.util.Scanner;

public class ConsoleViewer implements View{
    private Scanner in;

    public ConsoleViewer() {
        this.in = new Scanner(System.in);
    }

    private int getIntFix(){
        int result = 0;

        if(in.hasNextInt()){
            result = in.nextInt();
        }else{
            System.out.println("---------------------!!!ВНИМАНИЕ!!!--------------------------");
            System.out.println("Ошибка ввода, введите число!");
        }
        in.nextLine(); // Fix new line symbol
        return result;
    }

    private double getDoubleFix(){
        double result = 0;

        if(in.hasNextDouble()){
            result = in.nextDouble();
        }else{
            System.out.println("---------------------!!!ВНИМАНИЕ!!!--------------------------");
            System.out.println("Ошибка ввода, введите число!");
        }
        in.nextLine(); // Fix new line symbol
        return result;
    }

    @Override
    public ComplexNumber getComplexNumber() {
        ComplexNumber complexNumber = new ComplexNumber();

        System.out.println("комплексное число");

        System.out.print("Действительнуя часть: ");
        complexNumber.setRealPart(getDoubleFix());

        System.out.print("Мнимую часть: ");
        complexNumber.setImaginaryPart(getDoubleFix());

        return complexNumber;
    }

    @Override
    public double getNumber() {
        double result = 0;
        System.out.print("Введите число: ");
        return getDoubleFix();
    }

    @Override
    public void displayMenu(String title, Menu menu) {
        StringBuilder buildMenu = new StringBuilder("\n");
        buildMenu.append("-------------------------------------------------------------\n");
        buildMenu.append(String.format("%s\n", title));
        buildMenu.append("-------------------------------------------------------------\n");
        for (int i = 0; i < menu.getNumItems(); i++) {
            buildMenu.append(String.format("[%d] %s\n",
                    menu.getItemFromIndex(i).getIndex(), menu.getItemNameFromIndex(i)));
        }
        buildMenu.append("=============================================================\n");
        buildMenu.append(String.format("Выберете пункт меню от %d до %d: ", 1, menu.getNumItems()));

        System.out.print(buildMenu);
    }

    @Override
    public int getSelectedMenuItem() {
        int selectIndex = getIntFix();
        System.out.println("-------------------------------------------------------------");
        return selectIndex;
    }

    @Override
    public int getInputIndex(String title) {
        System.out.print(title);
        return getIntFix();
    }

    @Override
    public void displayText(String text) {
        System.out.print(text);
    }

    public void exit() {
        System.out.println("-------------------------------------------------------------");
        System.out.println("Выход из приложения.");
        System.out.println("-------------------------------------------------------------");
    }
}
