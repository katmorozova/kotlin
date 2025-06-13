package corporation

import java.io.File

class ProductCardsRepository {

    private val file = File("product_cards.txt")

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

    fun registerNewItem(productCard: ProductCard){
        saveProductCardToFile(productCard)
    }

    fun loadAllCards(): MutableList<ProductCard> {
        val cards: MutableList<ProductCard> = mutableListOf<ProductCard>()//creado collecion de los productCards

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

    fun removeProductCard(name: String){
        val cards: MutableList<ProductCard> = loadAllCards()
        for (card in cards){
            if (card.name == name) {
                cards.remove(card)
                break
            }
        }
        file.writeText("")//reescribimos texto en file
        for (card in cards){
            saveProductCardToFile(card)
        }
    }

}