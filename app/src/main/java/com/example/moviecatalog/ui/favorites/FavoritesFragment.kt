package com.example.moviecatalog.ui.favorites

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.moviecatalog.adapter.MovieAdapter
import com.example.moviecatalog.data.MovieRepository
import com.example.moviecatalog.databinding.FragmentFavoritesBinding

/**
 * Fragment que exibe os filmes favoritos (com rating >= 8.6)
 * Demonstra também o ciclo de vida de um Fragment
 * Utiliza GridLayout ao invés de LinearLayout para variedade
 */
class FavoritesFragment : Fragment() {

    private var _binding: FragmentFavoritesBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("FavoritesFragment", "onCreate() - Fragment criado")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d("FavoritesFragment", "onCreateView() - View do Fragment criada")
        _binding = FragmentFavoritesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("FavoritesFragment", "onViewCreated() - View criada e pronta para usar")
        
        setupRecyclerView()
        loadFavoriteMovies()
        
        Toast.makeText(requireContext(), "Filmes favoritos carregados!", Toast.LENGTH_SHORT).show()
    }

    private fun setupRecyclerView() {
        binding.recyclerViewFavorites.apply {
            layoutManager = GridLayoutManager(requireContext(), 2)
            setHasFixedSize(true)
        }
    }

    private fun loadFavoriteMovies() {
        val favoriteMovies = MovieRepository.getFavoriteMovies()
        val adapter = MovieAdapter(favoriteMovies) { movie ->
            Toast.makeText(
                requireContext(),
                "Você adicionou/removeu: ${movie.title}",
                Toast.LENGTH_SHORT
            ).show()
        }
        binding.recyclerViewFavorites.adapter = adapter
        binding.textViewFavoriteCount.text = "Filmes favoritos: ${favoriteMovies.size}"
    }

    override fun onStart() {
        super.onStart()
        Log.d("FavoritesFragment", "onStart() - Fragment ficou visível")
    }

    override fun onResume() {
        super.onResume()
        Log.d("FavoritesFragment", "onResume() - Fragment pronto para interação")
    }

    override fun onPause() {
        super.onPause()
        Log.d("FavoritesFragment", "onPause() - Fragment deixou de ter foco")
    }

    override fun onStop() {
        super.onStop()
        Log.d("FavoritesFragment", "onStop() - Fragment não está mais visível")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("FavoritesFragment", "onDestroyView() - View do Fragment foi destruída")
        _binding = null
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("FavoritesFragment", "onDestroy() - Fragment foi destruído")
    }

    companion object {
        @JvmStatic
        fun newInstance() = FavoritesFragment()
    }
}
