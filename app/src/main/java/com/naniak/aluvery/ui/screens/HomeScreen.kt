package com.naniak.aluvery.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.naniak.aluvery.model.Product
import com.naniak.aluvery.sampledata.sampleProducts
import com.naniak.aluvery.sampledata.sampleSections
import com.naniak.aluvery.ui.components.CardProductItem
import com.naniak.aluvery.ui.components.ProductsSection
import com.naniak.aluvery.ui.components.SearchTextField
import com.naniak.aluvery.ui.theme.AluveryTheme

@Composable
fun HomeScreen(
    sections: Map<String, List<Product>>, searchText: String = ""
) {
    Column() {
        var text by remember { mutableStateOf(searchText) }

        SearchTextField(
            text,
            Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) { newValue ->
            text = newValue
        }

        val searchedProduct = remember(text) {

            if (text.isNotBlank()) {
                sampleProducts.filter { product ->
                    product.name.contains(
                        text, true
                    ) || product.description?.contains(
                        text, true
                    ) ?: false
                }
            } else emptyList()


        }

        LazyColumn(
            Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(bottom = 16.dp)
        ) {

            if (text.isBlank()) {
                for (section in sections) {
                    val title = section.key
                    val products = section.value
                    item {
                        ProductsSection(
                            title = title, products = products
                        )
                    }
                }
            } else {
                items(searchedProduct) { p ->
                    CardProductItem(product = p, Modifier.padding(horizontal = 16.dp))
                }
            }


        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    AluveryTheme {
        Surface {
            HomeScreen(sampleSections)
        }
    }
}