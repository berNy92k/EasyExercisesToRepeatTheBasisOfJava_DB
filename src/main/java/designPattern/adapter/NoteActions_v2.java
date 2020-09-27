package designPattern.adapter;

import java.util.ArrayList;
import java.util.List;

public class NoteActions_v2 implements NoteInterface_v2 {

    private List<Note> notes = null;

    public NoteActions_v2() {
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
    public void readNoteByIndex(String index) {
        int indexInt = Integer.parseInt(index);
        System.out.println(notes.get(indexInt));
    }
}
