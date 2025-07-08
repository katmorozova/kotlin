package org.example.products


import products.ProductCard

fun main() {

    val products = ProductsRepository.products
    //products >500
    //product sport
    //product high ranking

    var filtered = filter(products) { it.productCategory == ProductCategory.CLOTHING }
    //var filtered = filter(products) { it.productPrice > 500 }
    //filtered = filter(filtered) {it.productCategory == ProductCategory.SPORTS }
    filtered = transform(filtered) {it.copy(productPrice = it.productPrice * 2) }
    val productNames = transform(filtered) {"${it.id} - ${it.productName} - ${it.productPrice}"}
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

    for (productCard in productNames){
        println(productCard)
    }
}

fun filter(products: List<ProductCard>, isSuitable: (ProductCard) -> Boolean): List<ProductCard> {
    val result = mutableListOf<ProductCard>()
    for (productCard in products){
        if (isSuitable(productCard)){
            result.add(productCard)
        }
    }
    return result
}

fun <R> transform(products: List<ProductCard>, operation: (ProductCard) -> R): List<R> {
    val result = mutableListOf<R>()
    for (productCard: ProductCard in products){
        result.add(operation(productCard))
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