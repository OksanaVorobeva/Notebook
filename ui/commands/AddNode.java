package ui.commands;

import ui.View;

public class AddNode implements Commands {

    private View view;

    public AddNode(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.addRecords();

    }

    @Override
    public String description() {

        return "Добавить новую запись";
    }

}
