package org.example.products

import org.example.extentions.transform
import products.ProductCard

fun main() {
    ProductsRepository.products
        .filter { it.productCategory == ProductCategory.CLOTHING }
        .map { it.copy(productPrice = it.productPrice * 2) }
        .map { "${it.id} - ${it.productName} - ${it.productPrice}" }
        .forEach { println(it) }
}

