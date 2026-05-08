package com.example.moviecatalog.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviecatalog.databinding.ItemMovieBinding
import com.example.moviecatalog.model.Movie

/**
 * Adapter para RecyclerView que gerencia a exibição da lista de filmes.
 * Este adapter implementa o padrão ViewHolder para otimizar a renderização.
 */
class MovieAdapter(
    private val movies: List<Movie>,
    private val onMovieClick: (Movie) -> Unit = {}
) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    inner class MovieViewHolder(private val binding: ItemMovieBinding) : 
        RecyclerView.ViewHolder(binding.root) {
        
        fun bind(movie: Movie) {
            binding.apply {
                textViewTitle.text = movie.title
                textViewYear.text = "Ano: ${movie.year}"
                textViewRating.text = "⭐ ${movie.rating}"
                textViewGenre.text = movie.genre
                textViewDescription.text = movie.description
                imageViewMovie.text = movie.imageUrl
                
                root.setOnClickListener {
                    onMovieClick(movie)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val binding = ItemMovieBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MovieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(movies[position])
    }

    override fun getItemCount(): Int = movies.size
}
