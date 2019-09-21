package ua.nure.liubchenko.lab1.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ua.nure.liubchenko.lab1.databinding.ListItemNoteBinding
import ua.nure.liubchenko.lab1.persistence.Note

class NoteAdapter : ListAdapter<Note, RecyclerView.ViewHolder>(NoteDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return NoteViewHolder(ListItemNoteBinding.inflate(
            LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val note = getItem(position)
        (holder as NoteViewHolder).bind(note)
    }

    class NoteViewHolder(
        private val binding: ListItemNoteBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Note) {
            binding.apply {
                note = item
                executePendingBindings()
            }
        }
    }
}

private class NoteDiffCallback : DiffUtil.ItemCallback<Note>() {

    override fun areItemsTheSame(oldItem: Note, newItem: Note): Boolean {
        return oldItem.noteId == newItem.noteId
    }

    override fun areContentsTheSame(oldItem: Note, newItem: Note): Boolean {
        return oldItem == newItem
    }
}
