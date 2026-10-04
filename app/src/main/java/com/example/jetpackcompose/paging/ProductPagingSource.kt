package com.example.jetpackcompose.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.jetpackcompose.fetchAllProducts
import com.example.jetpackcompose.models.Product

class ProductPagingSource: PagingSource<Int, Product>() {
    override fun getRefreshKey(state: PagingState<Int, Product>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(state.config.pageSize)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(state.config.pageSize)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Product> {
        return try {
            val skip = params.key ?: 0
            val limit = params.loadSize
            val response = fetchAllProducts(skip = skip, limit = limit)
            
            LoadResult.Page(
                data = response,
                prevKey = if (skip == 0) null else maxOf(0, skip - limit),
                nextKey = if (response.isEmpty()) null else skip + response.size
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }}
