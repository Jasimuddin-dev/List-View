package com.jasimuddin.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var listView:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView=findViewById(R.id.listView)

        val countryList=resources.getStringArray(R.array.countryList)

        val arrayAdapter=ArrayAdapter<String>(this@MainActivity,android.R.layout.simple_list_item_1,countryList)

        listView.adapter=arrayAdapter
        listView.setOnItemClickListener { parent, view, position, l ->

           val countryName= parent.getItemAtPosition(position).toString()
            Toast.makeText(applicationContext,"this is $countryName",Toast.LENGTH_LONG).show()
        }

    }
}