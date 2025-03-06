package com.example.listacomida

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.listacomida.model.Platillo
import com.example.listacomida.data.DataSource

@Composable
fun MenuCard(platillo: Platillo, modifier: Modifier = Modifier) {
    Card(modifier = Modifier.padding(10.dp)) {
        Row(modifier = Modifier.padding(10.dp)) {
            Image(
                painter = painterResource(id = platillo.drawableResId),
                contentDescription = stringResource(id = platillo.stringResourceId),
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = LocalContext.current.getString(platillo.stringResourceId),
                    style = MaterialTheme.typography.headlineMedium
                )
                Text(
                    text = "MX $${platillo.precio}",
                    style = MaterialTheme.typography.bodyMedium
                )
                Text(
                    text = "${platillo.oferta}",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Blue
                )
            }
        }
    }
}

@Composable
fun MenuCardList(platillos: List<Platillo>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(platillos) { platillo ->
            MenuCard(platillo = platillo)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MenuCard_Preview() {
    val dataSource = DataSource()
    val platillos = dataSource.LoadPlatillos()
    MenuCard(platillo = platillos[0])
}
