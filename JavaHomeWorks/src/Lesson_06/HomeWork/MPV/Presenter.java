package Lesson_06.HomeWork.MPV;

public class Presenter {
    private Model model;
    private View view;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void displayMenu(){
        view.menu();
    }
}
