package com.example.garmonybook.domain

data class NoteItem (
    val name: String,
    val description: String,
    val score: Int,
    var id: Int = UNDEFINED_ID
        ) {
    companion object {

        const val UNDEFINED_ID = -1
    }
}