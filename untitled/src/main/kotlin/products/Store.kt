package org.example.products

import org.example.extentions.myAlso
import org.example.extentions.transform
import products.ProductCard

fun main() {
    ProductsRepository.products.myAlso {
        println("Filter by category CLOTHING")
    }
        .filter { it.productCategory == ProductCategory.CLOTHING }.myAlso {
            println("Increase price")
        }.map { it.copy(productPrice = it.productPrice * 2) }.myAlso {
            println("Convert to String")
        }.map { "${it.id} - ${it.productName} - ${it.productPrice}" }.myAlso {
            println("Print info")
        }
        .forEach { println(it) }
}

