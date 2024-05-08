package com.alessandro.friendfindr

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.alessandro.friendfindr.activities.FavoriteActivity1
import com.alessandro.friendfindr.activities.PeopleActivity

class MainActivity : AppCompatActivity() {
    private lateinit var peopleBtn : Button
    private lateinit var favoriteBtn: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        peopleBtn = findViewById(R.id.btPeople)
        favoriteBtn = findViewById(R.id.btFavorite)


        peopleBtn.setOnClickListener {
            val intent = Intent(this, PeopleActivity::class.java)
            startActivity(intent)
        }

        favoriteBtn.setOnClickListener {
            val intent = Intent(this, FavoriteActivity1::class.java)
            startActivity(intent)
        }
    }
}