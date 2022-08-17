package com.meghamlabs.noteappcleanarch.features_note.data.data_sources

import androidx.room.Database
import androidx.room.RoomDatabase
import com.meghamlabs.noteappcleanarch.features_note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)

abstract class NoteDatabase : RoomDatabase(){
        abstract val noteDao: NoteDao
}