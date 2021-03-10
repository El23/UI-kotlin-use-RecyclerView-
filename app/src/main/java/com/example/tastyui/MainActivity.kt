package com.example.tastyui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val img = arrayOf(R.drawable.chernika, R.drawable.coffee, R.drawable.klubnika
    ,R.drawable.muesli,R.drawable.pancakes, R.drawable.tarelka, R.drawable.tosty)

    private val text = arrayOf("1 breakfast","2 breakfast","3 breakfast","4 breakfast",
        "5 breakfast","6 breakfast")


    private val desc = arrayOf("iagody-chernika-klubnika-med-honey-bliny-strawberry", "coffee-cup-cookies-makaruny-krem-macaron-almond-kofe", "klubnika-fresh-berries-tvorog-strawberry-iagody-desert",
        "breakfast-muesli-fresh-berries-milk-zavtrak-miusli-iagody--1", "breakfast-pancakes-berries-blueberry-strawberry-zavtrak-bli",
        "tosty-hleb-dzhem-sok")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomAdapter(img,text, desc)
    }
}
