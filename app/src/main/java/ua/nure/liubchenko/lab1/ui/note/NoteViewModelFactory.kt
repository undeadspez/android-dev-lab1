package ua.nure.liubchenko.lab1.ui.note

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ua.nure.liubchenko.lab1.persistence.NoteRepository

class NoteViewModelFactory(
    private val noteRepository: NoteRepository
) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T =
        NoteViewModel(noteRepository) as T
}
