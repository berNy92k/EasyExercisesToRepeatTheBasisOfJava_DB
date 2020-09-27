package designPattern.adapter;

public class NoteActionsAdapter implements NoteInterface, NoteInterface_v2 {

    NoteActions_v2 noteActions = new NoteActions_v2();

    @Override
    public void addNote(Note note) {
        noteActions.addNote(note);
    }

    @Override
    public void removeNote(Note note) {
        noteActions.removeNote(note);
    }

    @Override
    public void readNoteByIndex(String index) {
        noteActions.readNoteByIndex(index);
    }

    @Override
    public void readNoteByIndex(int index) {
        noteActions.readNoteByIndex(String.valueOf(index));
    }
}
