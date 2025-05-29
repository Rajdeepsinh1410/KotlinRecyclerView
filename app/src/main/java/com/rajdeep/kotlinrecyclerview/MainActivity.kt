package com.rajdeep.kotlinrecyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView : RecyclerView
    lateinit var dataList : ArrayList<DataClass>
    lateinit var imageList : Array<Int>
    lateinit var textList : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        imageList = arrayOf(
            R.drawable.fb,
            R.drawable.instra,
            R.drawable.whatapp,
            R.drawable.fb,
            R.drawable.instra,
            R.drawable.whatapp,
            R.drawable.fb,
            R.drawable.instra,
            R.drawable.whatapp,
            R.drawable.fb,
            R.drawable.instra,
            R.drawable.whatapp
        )
        textList = arrayOf(
            "Facebook",
            "Instagram",
            "Whatsapp",
            "Facebook",
            "Instagram",
            "Whatsapp",
            "Facebook",
            "Instagram",
            "Whatsapp",
            "Facebook",
            "Instagram",
            "Whatsapp"
        )

        recyclerView = findViewById(R.id.recycleView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        dataList = arrayListOf<DataClass>()
        getData()
    }

    private fun getData(){
        for (i in imageList.indices){
            var dataClass = DataClass(imageList[i],textList[i])
            dataList.add(dataClass)
        }
        recyclerView.adapter = AdapterClass(dataList)
    }
}