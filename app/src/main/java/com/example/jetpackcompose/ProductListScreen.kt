package com.example.jetpackcompose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.paging.LoadState
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.itemKey
import coil.compose.AsyncImage
import com.example.jetpackcompose.models.Product

@Composable
fun ProductListScreen(modifier: Modifier = Modifier, viewModel: ProductViewmodel) {
    val productItems = viewModel.productFlow.collectAsLazyPagingItems()

    Box(modifier = modifier.fillMaxSize()) {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(
                count = productItems.itemCount,
                key = productItems.itemKey { it.id }
            ) { index ->
                productItems[index]?.let {
                    ProductItem(product = it)
                }
            }

            // Append loading state
            if (productItems.loadState.append is LoadState.Loading) {
                item {
                    Box(modifier = Modifier.fillMaxWidth().padding(16.dp), contentAlignment = Alignment.Center) {
                        CircularProgressIndicator()
                    }
                }
            }
            
            // Append error state
            if (productItems.loadState.append is LoadState.Error) {
                item {
                    val error = productItems.loadState.append as LoadState.Error
                    Text(
                        text = "Error: ${error.error.localizedMessage}",
                        modifier = Modifier.padding(16.dp),
                        color = MaterialTheme.colorScheme.error
                    )
                }
            }
        }

        // Initial loading state
        if (productItems.loadState.refresh is LoadState.Loading) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
        }

        // Initial error state
        if (productItems.loadState.refresh is LoadState.Error) {
            val error = productItems.loadState.refresh as LoadState.Error
            Text(
                text = "Error: ${error.error.localizedMessage}",
                modifier = Modifier.align(Alignment.Center).padding(16.dp),
                color = MaterialTheme.colorScheme.error
            )
        }
    }
}

@Composable
fun ProductItem(product: Product) {

    Column(modifier = Modifier.padding(16.dp)) {
        AsyncImage(
            model = product.thumbnail,
            contentDescription = "Product image for ${product.title}",
            modifier = Modifier.fillMaxWidth().height(120.dp),
            contentScale = ContentScale.Crop

        )
        Spacer(modifier = Modifier.height(8.dp))

        Text(text = product.title, style = MaterialTheme.typography.titleMedium)
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = product.description, style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = "Price: $${product.price}", style = MaterialTheme.typography.bodyMedium)


    }
}


