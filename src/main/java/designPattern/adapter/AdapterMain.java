package designPattern.adapter;

import java.util.Date;

public class AdapterMain {

    public static void main(String[] args) {
        Note note1 = new Note.Builder()
                .setTitle("Title1")
                .setDescription("Desc1")
                .setCreationDate(new Date())
                .build();

        Note note2 = new Note.Builder()
                .setTitle("Title2")
                .setDescription("Desc2")
                .setCreationDate(new Date())
                .build();

        NoteActionsAdapter noteActionsAdapter = new NoteActionsAdapter();
        noteActionsAdapter.addNote(note1);
        noteActionsAdapter.readNoteByIndex("0");

        noteActionsAdapter.addNote(note2);
        noteActionsAdapter.readNoteByIndex(1);
    }

}
