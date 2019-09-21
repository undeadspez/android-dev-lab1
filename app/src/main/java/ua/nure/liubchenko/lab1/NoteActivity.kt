package ua.nure.liubchenko.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ua.nure.liubchenko.lab1.ui.note.NoteFragment

class NoteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_note)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, NoteFragment.newInstance())
                .commitNow()
        }
    }

}
