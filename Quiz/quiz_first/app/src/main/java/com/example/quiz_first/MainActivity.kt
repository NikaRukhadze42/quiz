package com.example.quiz_first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity() : AppCompatActivity() , View.OnClickListener{


    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
    //ვიზუალზე დავკარგე დრო და ფუნქციონალზე დასაფიქრებლად დრო არ დამრჩა

    private var users = mutableListOf <User>()

    private fun checkAdd() {
        if (textName.text.isEmpty()) {
            Toast.makeText(this, "Incorrect Name", Toast.LENGTH_SHORT).show()
        } else if (textSurname.text.isEmpty()) {
            Toast.makeText(this, "Incorrecrt Lastname", Toast.LENGTH_SHORT).show()
        } else if (textAge.text.isEmpty()) {
            Toast.makeText(this, "Incorrect Age", Toast.LENGTH_SHORT).show()
        } else if (textEmail.text.isEmpty()) {
        }
        Toast.makeText(this, "Incorrect Mail", Toast.LENGTH_SHORT).show()

    }

    private fun newUser(){
        var tmp = 0
        users.add(tmp,User())
        users[tmp].name = textName.text.toString()
        users[tmp].surName = textSurname.text.toString()
        users[tmp].age=textAge.text.toString()
        users[tmp].email=textEmail.text.toString()
        tmp++
    }

    private fun init()
    {
        buttonAdd.setOnClickListener(this)
        buttonRemove.setOnClickListener(this)
        textName.setOnClickListener(this)
    }

    override fun onClick(v: View?)
    {
        checkAdd()
        newUser()
    }
}

