package notebook;

import java.util.ArrayList;
import java.util.List;

import note.Note;

import java.io.Serializable;

public class Notebook implements Serializable {

    private List<Note> notebook;

    public Notebook() {
        notebook = new ArrayList<>();

    }

    public Notebook(List<Note> notebook) {
        this.notebook = notebook;
    }

    public void addNote(Note note) {
        //Note note2 = new Note(null, null, null);
        notebook.add(note);

    }

    public List<Note> getNotebook() {
        return notebook;
    }

    @Override
    public String toString() {
        
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < notebook.size(); i++) {
            stringBuilder.append(notebook.get(i));
            stringBuilder.append("\n");
        }
         return stringBuilder.toString();
    }

}
