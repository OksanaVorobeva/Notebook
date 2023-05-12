package servise;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import note.Note;
import notebook.Notebook;
import savingFile.FileHandler;
import savingFile.Writable;


public class Servis {

    private Notebook  notebook;
    private Writable writable;

    public Servis(Notebook notebook, Writable writable) {
        this.notebook = notebook;
        this.writable = writable;

    }

    public void addNote(LocalDate date, String note, String time) {
        Note notes = new Note(date, note, time);
        notebook.addNote(notes);

    }

    public void save() {

        writable.save(notebook, "Test.txt");
    }

    public void read(){
        notebook=(Notebook) writable.read("Test.txt");
    }

    public String print() {
        return notebook.toString();
    }
}
