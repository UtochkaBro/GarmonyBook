package com.example.garmonybook.domain

class DeleteNoteItemUseCase(private val noteListRepository: NoteListRepository) {

    fun deleteNoteItem(noteItem: NoteItem){
        noteListRepository.deleteNoteItem(noteItem)
    }
}