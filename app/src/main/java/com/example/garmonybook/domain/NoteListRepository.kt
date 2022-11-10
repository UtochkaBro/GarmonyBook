package com.example.garmonybook.domain

interface NoteListRepository {

    fun addDescriptionItem(descriptionItem: NoteItem)

    fun addNoteItem(noteItem: NoteItem)

    fun deleteNoteItem(noteItem: NoteItem)

    fun editNoteItem(noteItem: NoteItem)

    fun getNoteItem(noteItemId: Int): NoteItem

    fun getNoteList(): List<NoteItem>
}