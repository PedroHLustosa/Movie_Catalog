package com.example.moviecatalog.model

/**
 * Data class que representa uma entidade de filme no aplicativo.
 * Esta é a classe de dados mencionada nos requisitos da atividade.
 * 
 * A data class em Kotlin gera automaticamente:
 * - equals() e hashCode()
 * - toString()
 * - copy()
 * - componentN() functions (destructuring)
 */
data class Movie(
    val id: Int,
    val title: String,
    val year: Int,
    val rating: Double,
    val description: String,
    val genre: String,
    val imageUrl: String
)
