package com.meghamlabs.noteappcleanarch.features_note.data.data_sources

import androidx.room.*
import com.meghamlabs.noteappcleanarch.features_note.domain.model.Note
import kotlinx.coroutines.flow.Flow


@Dao
interface NoteDao {

    @Query("SELECT * FROM  note")
    fun getNotes(): Flow<List<Note>>


    @Query("SELECT * FROM note WHERE id = :id")
    suspend fun getNoteById(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)


    @Delete
    suspend fun deleteNote(note: Note)

}