package com.example.jetpackcompose

import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.example.jetpackcompose.models.Product
import com.example.jetpackcompose.paging.ProductPagingSource

class ProductPager {
    fun getProducts(): Pager<Int, Product>{
        return Pager(PagingConfig(pageSize = 10)){
            ProductPagingSource()

        }
    }

}