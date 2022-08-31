package com.padoapp.caio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainToolBar = findViewById<MaterialToolbar>(R.id.mainToolBar)
        mainToolBar.setNavigationOnClickListener{
            Toast.makeText(this,
                "Hamburguer pressionado!!!",
                Toast.LENGTH_SHORT)
                .show()
        }

        mainToolBar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.menu_item_notifications -> {
                    Toast.makeText(
                        this,
                        "Ir para a pagina de notificacoes!!!",
                        Toast.LENGTH_SHORT
                    )
                        .show()

                    true
                }
                R.id.menu_item_cart -> {
                    Toast.makeText(
                        this,
                        "Ir para a pagina do carrinho!!!",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                    true
                }
                else -> false
            }
        }
    }
}