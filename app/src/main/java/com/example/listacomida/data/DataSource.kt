package com.example.listacomida.data

import com.example.listacomida.R
import com.example.listacomida.model.Platillo

class DataSource() {
    fun LoadPlatillos(): List<Platillo> {
        return listOf(
            Platillo(R.string.desayuno, R.drawable.desayuno, 50.0, "Ahorra hasta el 10%"),
            Platillo(R.string.postre, R.drawable.postre, 30.0, "Ahorra hasta el 15%"),
            Platillo(R.string.pozole, R.drawable.pozole, 100.0, "Ahorra hasta el 30%"),
            Platillo(R.string.pizza, R.drawable.pizza, 120.0, "Ahorra hasta el 20%"),
            Platillo(R.string.tacos, R.drawable.tacos, 80.0, "Ahorra hasta el 25%"),
            Platillo(R.string.hamburger, R.drawable.hamburger, 90.0, "Ahorra hasta el 18%")
        )
    }
}
