package com.example.dineshkumar_a.kttest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.second_layout.*

/**
 * Created by dineshkumar_a on 1/10/2018.
 */
class SecondActivity : AppCompatActivity (){

    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter:RecycleAdapter
    private var myList =ArrayList<Photo>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)
        linearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayoutManager
        // set data to model class
        myList.add( Photo("dinesh",5,"https://api.androidhive.info/json/movies/1.jpg"))
        myList.add( Photo("dinesh",6,"https://api.androidhive.info/json/movies/2.jpg"))
        myList.add( Photo("dinesh",7,"https://api.androidhive.info/json/movies/3.jpg"))
        myList.add( Photo("dinesh",8,"https://api.androidhive.info/json/movies/4.jpg"))
        myList.add( Photo("dinesh",9, "https://api.androidhive.info/json/movies/5.jpg"))
        myList.add( Photo("dinesh",9, "https://api.androidhive.info/json/movies/6.jpg"))
        myList.add( Photo("dinesh",9, "https://api.androidhive.info/json/movies/7.jpg"))
        myList.add( Photo("dinesh",9, "https://api.androidhive.info/json/movies/8.jpg"))
        myList.add( Photo("dinesh",9, "https://api.androidhive.info/json/movies/9.jpg"))
        myList.add( Photo("dinesh",9, "https://api.androidhive.info/json/movies/7.jpg"))
        myList.add( Photo("dinesh",9, "https://api.androidhive.info/json/movies/1.jpg"))
        myList.add( Photo("dinesh",9, "https://api.androidhive.info/json/movies2.jpg"))
        myList.add( Photo("dinesh",9, "https://api.androidhive.info/json/movies/3.jpg"))
        myList.add( Photo("dinesh",9, "https://api.androidhive.info/json/movies/4.jpg"))
        myList.add( Photo("dinesh",9, "https://api.androidhive.info/json/movies/5.jpg"))
        myList.add( Photo("dinesh",9, "https://api.androidhive.info/json/movies/6.jpg"))
        myList.add( Photo("dinesh",9, "https://api.androidhive.info/json/movies/7.jpg"))
        myList.add( Photo("dinesh",9, "https://api.androidhive.info/json/movies/8.jpg"))
        myList.add( Photo("dinesh",9, "https://api.androidhive.info/json/movies/1.jpg"))
        myList.add( Photo("dinesh",9, "https://api.androidhive.info/json/movies/2.jpg"))


        adapter = RecycleAdapter(myList,this)
        recyclerView.adapter=adapter


    }
}