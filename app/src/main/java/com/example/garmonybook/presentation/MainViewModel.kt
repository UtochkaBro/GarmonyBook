package com.example.garmonybook.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.garmonybook.data.NoteListRepositoryImpl
import com.example.garmonybook.domain.DeleteNoteItemUseCase
import com.example.garmonybook.domain.EditNoteItemUseCase
import com.example.garmonybook.domain.GetNoteListUseCase
import com.example.garmonybook.domain.NoteItem

class MainViewModel : ViewModel() {

    private val repository = NoteListRepositoryImpl

    private val getNoteListUseCase = GetNoteListUseCase(repository)
    private val deleteNoteItemUseCase = DeleteNoteItemUseCase(repository)
    private val editNoteItemUseCase = EditNoteItemUseCase(repository)

    val noteList = getNoteListUseCase.getNoteList()

    fun deleteNoteItem(noteItem: NoteItem){
        deleteNoteItemUseCase.deleteNoteItem(noteItem)
    }

    fun changeEnableState(noteItem: NoteItem){
        val newNote = noteItem.copy(enabled = !noteItem.enabled)
        editNoteItemUseCase.editNoteItem(newNote)
    }
}