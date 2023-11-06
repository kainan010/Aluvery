package com.naniak.aluvery.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(name = "TESTE DO KAINAN ", showSystemUi = true)
@Composable
fun BoxCollumAndRow(){
    Box (modifier = Modifier.background(Color.Blue), contentAlignment = Alignment.Center) {



        Column (
            Modifier.background(color = Color.Red)

                .padding(8.dp)


        ){
            Text(text = "EU QUERO PARAR DE SENTIR MDS...")
            Row( Modifier
                .padding(8.dp)
                .background(color = Color.Cyan)
                .padding(all = 8.dp)
                .fillMaxWidth()
            ) {
                Text(text = "UM DIA EU PARO SE DEUS QUISER ")
                Text(text = ".....AMEM")
            }
            Text(text = "TESTE dentro column ")
        }
        Text(text = "BOX fora de todos ")
    }
}



@Composable
fun MyFirstComposable() {
    Text(text = "TESTE KAINAN das ")
}

@Preview(name = "PReview2", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Preview(name = "Preview", heightDp = 100, widthDp = 100, showBackground = true)
@Composable
fun MyFirstComposablePreview() {
    MyFirstComposable()
}