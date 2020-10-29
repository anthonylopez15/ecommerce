package br.com.anthony.ecommerce

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CategoryAdapter : RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    private var data = categories()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.categoryName.text = item.categoryName
        holder.categoryImage.setImageResource(
            when (item.categoryImage) {
                2 -> R.drawable.ic_groceries
                3 -> R.drawable.ic_vegetables
                4 -> R.drawable.ic_fish
                5-> R.drawable.ic_beef
                6 -> R.drawable.ic_cooking
                7 -> R.drawable.ic_food
                8 -> R.drawable.ic_baby_care
                else -> R.drawable.ic_fruits
            }
        )

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater
            .inflate(R.layout.categories_item, parent, false)

        return ViewHolder(view)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val categoryName: TextView = itemView.findViewById(R.id.category_name)
        val categoryImage: ImageView = itemView.findViewById(R.id.category_image)
    }

    private fun categories(): MutableList<MainActivity.Categories> {
        return mutableListOf(
            MainActivity.Categories(
                categoryName = "All",
                categoryImage = 1
            ),
            MainActivity.Categories(
                categoryName = "Fruits",
                categoryImage = 2
            ),
            MainActivity.Categories(
                categoryName = "Vegetables",
                categoryImage = 3
            ),
            MainActivity.Categories(
                categoryName = "Fish",
                categoryImage = 4
            ),
            MainActivity.Categories(
                categoryName = "Meat",
                categoryImage = 5
            ),
            MainActivity.Categories(
                categoryName = "Cook",
                categoryImage = 6
            ),
            MainActivity.Categories(
                categoryName = "Dairy",
                categoryImage = 7
            ),
            MainActivity.Categories(
                categoryName = "Baby Care",
                categoryImage = 8
            )


        )

    }

}
