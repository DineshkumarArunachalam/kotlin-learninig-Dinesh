package com.example.dineshkumar_a.kttest

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.recyclerview_item_row.view.*

/**
 * Created by dineshkumar_a on 1/10/2018.
 */
class PhotoHolder (v: View,ct: Context) : RecyclerView.ViewHolder(v) , View.OnClickListener {
//1
    private var context:Context=ct

    private var view :View =v;
    //2
    private  var photo:Photo?=null
//3
    init {
        view.setOnClickListener(this)
    }
    //4
    override fun onClick(p0: View?) {


    }

    companion object {
        //5
        private val PHOTO_KEY = "PHOTO"
    }

    // bind the view with the list data

    fun bindPhoto( photo : Photo) {
        this.photo=photo
        view.itemDate.text=photo.name
        view.itemDescription.text=photo.age.toString()
        Glide.with(context).load(photo.image).into(view.itemImage);

    }


}