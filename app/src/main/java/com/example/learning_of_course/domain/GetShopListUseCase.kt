package com.example.learning_fragment_activity.domain

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopList(): List<ShopItem> {
        return shopListRepository.getShopList()
    }
}