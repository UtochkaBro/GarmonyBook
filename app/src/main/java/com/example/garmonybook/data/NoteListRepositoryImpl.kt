package com.example.garmonybook.data

import com.example.garmonybook.domain.NoteItem
import com.example.garmonybook.domain.NoteListRepository
import java.lang.RuntimeException

object NoteListRepositoryImpl: NoteListRepository {

    private val noteList = mutableListOf<NoteItem>();

    private var autoIncrementId = 0

    override fun addNoteItem(noteItem: NoteItem) {
        if (noteItem.id == NoteItem.UNDEFINED_ID) {
            noteItem.id = autoIncrementId++
        }
        noteList.add(noteItem)
    }

    override fun addDescriptionItem(descriptionItem: NoteItem) {
        noteList.add(descriptionItem)
    }

    override fun deleteNoteItem(noteItem: NoteItem) {
        noteList.remove(noteItem)
    }

    override fun editNoteItem(noteItem: NoteItem) {
        val oldElement = getNoteItem(noteItem.id)
        noteList.remove(oldElement)
        addNoteItem(noteItem)
    }

    override fun getNoteItem(noteItemId: Int): NoteItem {
        return noteList.find {
            it.id == noteItemId
        } ?: throw RuntimeException("Элемент $noteItemId не найден")
    }

    override fun getNoteList(): List<NoteItem> {
        return noteList.toList()
    }
}