package com.example.a03aug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a03aug.models.BlogPost

class seventh : AppCompatActivity() {
    private lateinit var blogAdapter: BlogRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seventh)
        initRecyclerView()
        addDataSet()

    }

    private fun addDataSet() {
        val data = DataSource.createDataSet()
        blogAdapter.submitList(data)

    }

    private fun initRecyclerView() {
        val recycler_view = findViewById<RecyclerView>(R.id.recycler_view)
        recycler_view.apply {
            layoutManager = LinearLayoutManager(this@seventh)
            blogAdapter = BlogRecyclerAdapter()
            adapter = blogAdapter

        }


    }
}

