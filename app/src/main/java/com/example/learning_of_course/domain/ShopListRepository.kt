package com.example.learning_fragment_activity.domain

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)
    fun editShopItem(shopItem: ShopItem)
    fun getShopItemById(shopItemId: Int): ShopItem
    fun removeShopItem(shopItem: ShopItem)
    fun getShopList(): List<ShopItem>
}