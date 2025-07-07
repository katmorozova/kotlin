package org.example.products

import products.ProductCard

class ConditionHighRanking: Condition {

    override fun isSuitable(productCard: ProductCard): Boolean {
        return productCard.productRating > 4
    }
}