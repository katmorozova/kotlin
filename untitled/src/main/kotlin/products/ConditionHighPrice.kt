package org.example.products

import products.ProductCard

class ConditionHighPrice: Condition {

    override fun isSuitable(productCard: ProductCard): Boolean {
        return productCard.productPrice > 500
    }
}