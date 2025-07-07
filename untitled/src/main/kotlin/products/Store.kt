package org.example.products

import products.ProductCard

fun main() {

    val products = ProductsRepository.products
    var filtered = filter(products, ConditionHighPrice())
    filtered = filter(filtered, ConditionSportsCategory())
    filtered = filter(filtered, ConditionHighRanking())

    for (productCard in filtered){
        println(productCard)
    }
}
//products >500
//product sport
//product high ranking

fun filter(products: List<ProductCard>, condition: Condition): List<ProductCard> {
    val result = mutableListOf<ProductCard>()
    for (productCard in products) {
        if(condition.isSuitable(productCard)) {
            result.add(productCard)
        }
    }
    return result
}