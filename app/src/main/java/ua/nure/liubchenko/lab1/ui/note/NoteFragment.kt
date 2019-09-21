package ua.nure.liubchenko.lab1.ui.note

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import ua.nure.liubchenko.lab1.adapters.NoteAdapter
import ua.nure.liubchenko.lab1.databinding.FragmentNoteBinding
import ua.nure.liubchenko.lab1.utils.InjectorUtils

class NoteFragment : Fragment() {

    companion object {
        fun newInstance() = NoteFragment()
    }

    private val viewModel: NoteViewModel by viewModels {
        InjectorUtils.provideNoteViewModelFactory()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentNoteBinding.inflate(inflater, container, false)
        context ?: return binding.root

        val adapter = NoteAdapter()
        binding.noteList.adapter = adapter
        subscribeUi(adapter)

        //setHasOptionsMenu(true)
        return binding.root
    }

    private fun subscribeUi(noteAdapter: NoteAdapter) {
        viewModel.notes.observe(viewLifecycleOwner) { notes ->
            noteAdapter.submitList(notes)
        }
    }

}
