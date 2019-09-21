package ua.nure.liubchenko.lab1.persistence

class NoteRepository {

    private val notes = arrayOf(
        Note("1", "Title 1", "Description 1"),
        Note("2", "Title 2", "Description 2"),
        Note("3", "Title 3", "Description 3"),
        Note("4", "Title 4", "Description 4"),
        Note("5", "Title 5", "Description 5")
    )

    fun getNotes() = notes

    companion object {

        @Volatile private var instance: NoteRepository? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: NoteRepository().also { instance = it }
            }

    }

}