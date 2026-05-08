package com.example.moviecatalog.data

import com.example.moviecatalog.model.Movie

object MovieRepository {
    
    fun getAllMovies(): List<Movie> {
        return listOf(
            Movie(
                id = 1,
                title = "A Origem",
                year = 2010,
                rating = 8.8,
                description = "Um ladrão especializado em roubar segredos do subconsciente.",
                genre = "Ficção Científica",
                imageUrl = "🎬"
            ),
            Movie(
                id = 2,
                title = "Interestelar",
                year = 2014,
                rating = 8.6,
                description = "Uma jornada através de um buraco de minhoca para salvar a humanidade.",
                genre = "Ficção Científica",
                imageUrl = "🚀"
            ),
            Movie(
                id = 3,
                title = "O Cavaleiro das Trevas",
                year = 2008,
                rating = 9.0,
                description = "Batman enfrenta o Coringa, um criador de caos.",
                genre = "Ação/Crime",
                imageUrl = "🦇"
            ),
            Movie(
                id = 4,
                title = "Pulp Fiction",
                year = 1994,
                rating = 8.9,
                description = "Histórias entrelaçadas de criminosos em Los Angeles.",
                genre = "Crime/Drama",
                imageUrl = "🔫"
            ),
            Movie(
                id = 5,
                title = "Matrix",
                year = 1999,
                rating = 8.7,
                description = "Um hacker descobre a verdadeira natureza da realidade.",
                genre = "Ficção Científica",
                imageUrl = "💊"
            ),
            Movie(
                id = 6,
                title = "Parasita",
                year = 2019,
                rating = 8.6,
                description = "Uma família pobre se integra na vida de uma família rica.",
                genre = "Drama/Thriller",
                imageUrl = "🏠"
            ),
            Movie(
                id = 7,
                title = "Oppenheimer",
                year = 2023,
                rating = 8.3,
                description = "A história do desenvolvimento da bomba atômica.",
                genre = "Drama/História",
                imageUrl = "☢️"
            ),
            Movie(
                id = 8,
                title = "Barbie",
                year = 2023,
                rating = 7.9,
                description = "Barbie e Ken exploram o significado da vida real.",
                genre = "Comédia/Fantasia",
                imageUrl = "💅"
            ),
            Movie(
                id = 9,
                title = "Gattaca",
                year = 1997,
                rating = 8.1,
                description = "Em um futuro genético, um homem comum sonha em ir para o espaço.",
                genre = "Ficção Científica",
                imageUrl = "🧬"
            ),
            Movie(
                id = 10,
                title = "Cidade de Deus",
                year = 2002,
                rating = 8.8,
                description = "A vida nas favelas do Rio de Janeiro através de diferentes perspectivas.",
                genre = "Drama",
                imageUrl = "🌃"
            ),
            Movie(
                id = 11,
                title = "Clube da Luta",
                year = 1999,
                rating = 8.8,
                description = "Um homem insone forma um clube secreto de luta.",
                genre = "Drama/Thriller",
                imageUrl = "👊"
            ),
            Movie(
                id = 12,
                title = "Inception",
                year = 2010,
                rating = 8.8,
                description = "Roubar segredos do subconsciente enquanto sonhando.",
                genre = "Ficção Científica",
                imageUrl = "💭"
            )
        )
    }

    fun getFavoriteMovies(): List<Movie> {
        return getAllMovies().filter { it.rating >= 8.6 }
    }

    fun getMovieById(id: Int): Movie? {
        return getAllMovies().find { it.id == id }
    }

    fun searchMovies(query: String): List<Movie> {
        return getAllMovies().filter { 
            it.title.contains(query, ignoreCase = true) ||
            it.genre.contains(query, ignoreCase = true)
        }
    }
}
