package com.example.garmonybook.domain

class AddDescriptionItemUseCase (private val noteListRepository: NoteListRepository) {

    fun addDescriptionItem(descriptionItem: NoteItem) {

        noteListRepository.addDescriptionItem(descriptionItem);
    }
}