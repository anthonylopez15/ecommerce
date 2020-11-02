package br.com.anthony.ecommerce

fun categories(): MutableList<MainActivity.Categories> {
    return mutableListOf(
        MainActivity.Categories(categoryName = "All", categoryImage = 1),
        MainActivity.Categories(categoryName = "Fruits", categoryImage = 2),
        MainActivity.Categories(categoryName = "Vegetables", categoryImage = 3),
        MainActivity.Categories(categoryName = "Fish", categoryImage = 4),
        MainActivity.Categories(categoryName = "Meat", categoryImage = 5),
        MainActivity.Categories(categoryName = "Cook", categoryImage = 6),
        MainActivity.Categories(categoryName = "Dairy", categoryImage = 7),
        MainActivity.Categories(categoryName = "Baby Care", categoryImage = 8))

}