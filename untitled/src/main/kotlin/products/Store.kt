package org.example.products


import products.ProductCard

fun main() {
    //products >500
    //product sport
    //product high ranking

    val products = ProductsRepository.products
        //.filter { it.productPrice > 500 }
        //.filter { it.productCategory == ProductCategory.SPORTS }
        .filter { it.productCategory == ProductCategory.CLOTHING }
        .transform { it.copy(productPrice = it.productPrice * 2) }
        .transform { "${it.id} - ${it.productName} - ${it.productPrice}" }

    //var filtered = filter(products) { it.productCategory == ProductCategory.CLOTHING }
    //var filtered = filter(products) { it.productPrice > 500 }
    //filtered = filter(filtered) {it.productCategory == ProductCategory.SPORTS }
    //filtered = transform(filtered) {it.copy(productPrice = it.productPrice * 2) }
    //val productNames = transform(filtered) {"${it.id} - ${it.productName} - ${it.productPrice}"}
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

    for (productCard in products){
        println(productCard)
    }
}

fun List<ProductCard>.filter(isSuitable: (ProductCard) -> Boolean): List<ProductCard> {
    val result = mutableListOf<ProductCard>()
    for (productCard in this){
        if (isSuitable(productCard)){
            result.add(productCard)
        }
    }
    return result
}

fun <R> List<ProductCard>.transform(operation: (ProductCard) -> R): List<R> {
    val result = mutableListOf<R>()
    for (productCard: ProductCard in this){
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