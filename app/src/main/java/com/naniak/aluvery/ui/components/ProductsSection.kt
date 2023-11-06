package com.naniak.aluvery.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.naniak.aluvery.model.Product
import com.naniak.aluvery.sampledata.sampleProducts
import com.naniak.aluvery.ui.theme.AluveryTheme


@Composable
fun ProductsSection(
    title: String,
    products: List<Product>,
    modifier: Modifier = Modifier
) {
//    Column(modifier) {
//        Text(
//            modifier = Modifier
//                .padding(start = 16.dp, end = 16.dp),
//            text = title,
//            fontWeight = FontWeight(700),
//            fontSize = 20.sp
//        )
//        LazyRow(
//            modifier = Modifier
//                .padding(top = 8.dp)
//                .fillMaxWidth(),
//            horizontalArrangement = Arrangement.spacedBy(16.dp),
//            contentPadding = PaddingValues(horizontal = 16.dp)
//
//        ) {
//            items(products) { p ->
//                ProductItem(product = p)
//            }
//
//        }
//    }
    Section(
        title = {
            Text(
                text = title,
                Modifier.padding(
                    start = 16.dp,
                    end = 16.dp
                ),
                fontSize = 20.sp,
                fontWeight = FontWeight(400)
            )
        },
        content = {
            LazyRow(
                Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                contentPadding = PaddingValues(horizontal = 16.dp)
            ) {
                items(products) { p ->
                    ProductItem(product = p)
                }
            }
        },
        modifier = modifier
    )

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProductsSectionPreview() {
    AluveryTheme {
        Surface {
            ProductsSection("Promoções", products = sampleProducts)
        }
    }
}

