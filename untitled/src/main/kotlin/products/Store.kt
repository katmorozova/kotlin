package org.example.products

fun main() {

    val products = ProductsRepository.products
    for (productCard in products){
        println(productCard)
    }
}