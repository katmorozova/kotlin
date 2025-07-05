package org.example.products

import kotlinx.serialization.json.Json
import org.example.profile.Person
import products.ProductCard
import java.io.File

object ProductsRepository {
    private val file = File("products.json")
    private val _products = loadProducts()// backing field
    val products
        get() = _products.toList()


    private fun loadProducts(): List<ProductCard>{
        val content = file.readText().trim()
        return Json.decodeFromString(content)
    }


}