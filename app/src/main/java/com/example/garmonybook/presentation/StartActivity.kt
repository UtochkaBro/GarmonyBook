package com.example.garmonybook.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.garmonybook.R

class StartActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        viewModel.noteList.observe(this){
            Log.d("MainActivityTest", it.toString())

            if (count == 0) {
                count ++
                val note = it[0]
                viewModel.deleteNoteItem(note)
            }
        }
    }
}