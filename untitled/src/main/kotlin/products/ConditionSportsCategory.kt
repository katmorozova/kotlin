package org.example.products

import products.ProductCard

class ConditionSportsCategory: Condition {

    override fun isSuitable(productCard: ProductCard): Boolean {
        return productCard.productCategory == ProductCategory.SPORTS
    }
}