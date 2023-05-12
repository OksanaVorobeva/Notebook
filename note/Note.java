package note;

import java.io.Serializable;
import java.time.LocalDate;

public class Note implements Serializable {

    // private LocalDate date;
    private LocalDate date;
    private String note;
    private String time;

    public Note(LocalDate date, String note, String time) {
        this.date = date;
        this.note = note;
        this.time = time;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getNote() {
        return note;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {

        return "Дата " + date + ", " + note + " в " + time;
    }
    // Дата 20.04.2023, дантист в 17.30
}