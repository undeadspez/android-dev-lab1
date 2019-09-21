package ua.nure.liubchenko.lab1.utils

import ua.nure.liubchenko.lab1.persistence.NoteRepository
import ua.nure.liubchenko.lab1.ui.note.NoteViewModelFactory

object InjectorUtils {

    private fun getNoteRepository(): NoteRepository = NoteRepository.getInstance()

    fun provideNoteViewModelFactory(): NoteViewModelFactory {
        val repository = getNoteRepository()
        return NoteViewModelFactory(repository)
    }

}
