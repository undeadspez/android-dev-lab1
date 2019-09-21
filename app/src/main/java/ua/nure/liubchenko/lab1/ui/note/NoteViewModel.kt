package ua.nure.liubchenko.lab1.ui.note

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import ua.nure.liubchenko.lab1.persistence.Note
import ua.nure.liubchenko.lab1.persistence.NoteRepository

class NoteViewModel internal constructor(
    noteRepository: NoteRepository
): ViewModel() {
    val notes: LiveData<List<Note>> = noteRepository.getNotes()
}
