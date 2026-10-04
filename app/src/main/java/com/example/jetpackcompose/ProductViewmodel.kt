package com.example.jetpackcompose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn

class ProductViewmodel(repo: ProductPager = ProductPager()): ViewModel() {
    val productFlow = repo.getProducts().flow.cachedIn(viewModelScope)

}