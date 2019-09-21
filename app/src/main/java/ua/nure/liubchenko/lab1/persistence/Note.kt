package ua.nure.liubchenko.lab1.persistence

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class Note(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val noteId: String,
    val title: String,
    val description: String
) {
    override fun toString() = title
}
