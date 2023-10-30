package com.example.inventory.data

import androidx.room.Entity
import androidx.room.PrimaryKey


/**
 * Se crea la clase entity y se importa la librería entity para su funcionamiento
 */
@Entity(tableName = "items")
data class Item(
    @PrimaryKey
    val id: Int = 0,
    val name: String,
    val price: Double,
    val quantity: Int
)