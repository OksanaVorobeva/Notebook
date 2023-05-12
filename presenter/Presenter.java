package presenter;

import servise.Servis;
import java.time.LocalDate;

import ui.View;

public class Presenter {

    private View view;
    private Servis service;

    public Presenter(View view, Servis service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public void addNode(LocalDate date, String note, String time) {
        service.addNote(date, note, time);

    }

    public void getRecords() {
        String answer = service.print();
        System.out.println(answer);
    }

    public void saveFile() {
        service.save();
    }

    public void readFile() {
        service.read();
    }
}
