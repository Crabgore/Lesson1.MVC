package geekbrains.ru.lesson1mvc;

class Presenter {
    private Model model;
    private MainView view;

    Presenter(MainView view){
        model = new Model();
        this.view = view;
    }

    private void updateNewElementValue(int idx, int id){
        int newValue = model.getElementValueAtIndex(idx) + 1;
        model.setElementValueAtIndex(idx, newValue);
        view.setButtonText(id, newValue);
    }

    void btn1Click(int id) {
        updateNewElementValue(0, id);
    }

    void btn2Click(int id) {
        updateNewElementValue(1, id);
    }

    void btn3Click(int id) {
        updateNewElementValue(2, id);
    }
}
