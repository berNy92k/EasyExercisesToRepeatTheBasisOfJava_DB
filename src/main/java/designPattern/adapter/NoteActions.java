package designPattern.adapter;

import java.util.ArrayList;
import java.util.List;

public class NoteActions implements NoteInterface{

    private List<Note> notes = null;

    public NoteActions() {
        notes = new ArrayList<>();
    }

    @Override
    public void addNote(Note note) {
        notes.add(note);
    }

    @Override
    public void removeNote(Note note) {
        notes.remove(note);
    }

    @Override
    public void readNoteByIndex(int index) {
        System.out.println(notes.get(index));
    }
}
