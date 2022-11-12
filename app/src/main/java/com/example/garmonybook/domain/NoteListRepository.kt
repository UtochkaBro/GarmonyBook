package com.example.garmonybook.domain

import androidx.lifecycle.LiveData

interface NoteListRepository {

    fun addDescriptionItem(descriptionItem: NoteItem)

    fun addNoteItem(noteItem: NoteItem)

    fun deleteNoteItem(noteItem: NoteItem)

    fun editNoteItem(noteItem: NoteItem)

    fun getNoteItem(noteItemId: Int): NoteItem

    fun getNoteList(): LiveData<List<NoteItem>>
}