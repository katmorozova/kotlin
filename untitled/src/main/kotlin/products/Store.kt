package org.example.products


import products.ProductCard

fun main() {

    val products = ProductsRepository.products
    var filtered = filter(products) { it.productPrice > 500 }
    filtered = filter(filtered) {it.productCategory == ProductCategory.SPORTS }
    filtered = filter(filtered) {it.productRating > 4 }
    /*
    var filtered = filter(products, object : Condition{
        override fun isSuitable(productCard: ProductCard): Boolean {
            return productCard.productPrice > 500
        }
    })
    filtered = filter(filtered, object : Condition {
        override fun isSuitable(productCard: ProductCard): Boolean {
            return productCard.productCategory == ProductCategory.SPORTS
        }
    })
    filtered = filter(filtered, object : Condition{
        override fun isSuitable(productCard: ProductCard): Boolean {
            return productCard.productRating > 4
        }
    })

     */

    for (productCard in filtered){
        println(productCard)
    }
}
//products >500
//product sport
//product high ranking

fun filter(products: List<ProductCard>, isSuitable: (ProductCard) -> Boolean): List<ProductCard> {
    val result = mutableListOf<ProductCard>()
    for (productCard in products){
        if (isSuitable(productCard)){
            result.add(productCard)
        }
    }
    return result
}
/*
fun filter(products: List<ProductCard>, condition: Condition): List<ProductCard> {
    val result = mutableListOf<ProductCard>()
    for (productCard in products) {
        if(condition.isSuitable(productCard)) {
            result.add(productCard)
        }
    }
    return result
}

 */