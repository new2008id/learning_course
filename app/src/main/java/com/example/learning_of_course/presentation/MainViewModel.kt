package com.example.learning_fragment_activity.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.learning_fragment_activity.data.ShopListRepositoryImpl
import com.example.learning_fragment_activity.domain.EditShopItemUseCase
import com.example.learning_fragment_activity.domain.GetShopListUseCase
import com.example.learning_fragment_activity.domain.RemoveShopItemUseCase
import com.example.learning_fragment_activity.domain.ShopItem

class MainViewModel : ViewModel() {
    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val removeShopItemUseCase = RemoveShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = MutableLiveData<List<ShopItem>>()

    fun getShopList() {
        val list = getShopListUseCase.getShopList()
        shopList.value = list
    }

}