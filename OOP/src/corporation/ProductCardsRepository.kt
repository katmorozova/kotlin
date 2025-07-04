package corporation

import java.io.File

object ProductCardsRepository {

    private val file = File("product_cards.txt")
    private val _productCards = loadAllCards()
    val productCards
        get() = _productCards.toList()

/*
    private fun saveProductCardToFile(productCard: ProductCard) {
        file.appendText("${productCard.name}%${productCard.brand}%${productCard.price}%")
        when (productCard) {
            is Food -> { //Comprobamos si pertenece a tipo Food
                val caloric = productCard.caloric
                file.appendText("$caloric%")
            }
            is Shoes -> {
                val size = productCard.size
                file.appendText("$size%")
            }

            is Appliances -> {
                val power = productCard.power
                file.appendText("$power%")
            }
        }
        file.appendText("${productCard.productType}\n")
    }

 */

    fun registerNewItem(productCard: ProductCard){
        _productCards.add(productCard)
    }

    private fun loadAllCards(): MutableSet<ProductCard> {
        val cards: MutableSet<ProductCard> = mutableSetOf<ProductCard>()//creado collecion de los productCards

        if (!file.exists()) file.createNewFile()

        val content = file.readText().trim()

        if (content.isEmpty()){
            return cards
        }



        val cardsAsString = content.split("\n")
        for(cardAsString in cardsAsString){
            val properties = cardAsString.split("%")
            val name = properties[0]
            val brand = properties[1]
            val price = properties[2].toInt()
            val type = properties.last()


            val productType = ProductType.valueOf(type)
            val productCard = when(productType){
                ProductType.FOOD -> {
                    val caloric = properties[3].toInt()
                    Food(name, brand,caloric, price)
                }
                ProductType.APPLIANCES -> {
                    val power = properties[3].toInt()
                    Appliances(name, brand, power, price)

                }
                ProductType.SHOES -> {
                    val size = properties[3].toInt()
                    Shoes(name, brand, size, price)

                }
            }
            cards.add(productCard)
        }
        return cards
    }

    fun saveChanges(){
        val content = StringBuilder()
        for (productCard in _productCards){
            content.append("${productCard.name}%${productCard.brand}%${productCard.price}%")
            when (productCard) {
                is Food -> { //Comprobamos si pertenece a tipo Food
                    val caloric = productCard.caloric
                    content.append("$caloric%")
                }
                is Shoes -> {
                    val size = productCard.size
                    content.append("$size%")
                }

                is Appliances -> {
                    val power = productCard.power
                    content.append("$power%")
                }
            }
            content.append("${productCard.productType}\n")
        }
        file.writeText(content.toString())
    }

    fun removeProductCard(name: String){
        for (card in _productCards){
            if (card.name == name) {
                _productCards.remove(card)
                break
            }
        }
    }

}