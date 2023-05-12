import java.util.logging.FileHandler;

import notebook.Notebook;
import presenter.Presenter;
import servise.Servis;
import ui.Console;
import ui.View;


public class Program {

    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        View view = new Console();
        Servis servis = new Servis(notebook, new savingFile.FileHandler());
        Presenter presenter = new Presenter(view, servis);
        view.start();

    }
}
