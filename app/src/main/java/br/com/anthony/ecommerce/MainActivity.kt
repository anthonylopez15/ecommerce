package br.com.anthony.ecommerce

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    data class Categories(
        val categoryName: String,
        val categoryImage: Int)

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_categories)

        viewManager = GridLayoutManager(this, 3)
        viewAdapter = CategoryAdapter()

        recyclerView = findViewById(R.id.categories_list)
        recyclerView.layoutManager = viewManager
        recyclerView.adapter = viewAdapter
    }
}