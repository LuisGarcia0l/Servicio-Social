package com.example.firestore.kotlin.lomana.model

import com.google.firebase.Timestamp
import com.google.firebase.firestore.Exclude
import com.google.firebase.firestore.IgnoreExtraProperties

@IgnoreExtraProperties
data class Product(
    var id: String? = null,
    var name: String? = null,
    var price: Double? = null,
    var description: String? = null,
    var create_date: Timestamp? = null,
    var update_date: Timestamp? = null
) {
    @Exclude
    fun toMap(): Map<String, Any?> {
        return mapOf(
            "id" to id,
            "Nombre" to name,
            "Horas" to price,
            "Descripcion" to description,
            "Fecha de creacion" to create_date,
            "Fecha de actulizacion" to update_date,
        )
    }
}