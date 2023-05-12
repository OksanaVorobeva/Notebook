package ui.commands;

import ui.View;

public class PrintNote implements Commands {
    private View view;

    public PrintNote(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.printNote();

    }

    @Override
    public String description() {

        return "Вывести на экран";
    }

}
