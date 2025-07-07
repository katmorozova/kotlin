package org.example.products

import products.ProductCard

interface Condition {

    fun isSuitable(productCard: ProductCard): Boolean

}