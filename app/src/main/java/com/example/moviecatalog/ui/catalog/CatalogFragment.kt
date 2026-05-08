package com.example.moviecatalog.ui.catalog

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviecatalog.adapter.MovieAdapter
import com.example.moviecatalog.data.MovieRepository
import com.example.moviecatalog.databinding.FragmentCatalogBinding

/**
 * Fragment que exibe o catálogo completo de filmes.
 * Demonstra o ciclo de vida de um Fragment (onCreate, onStart, onResume, onPause, onStop, onDestroy)
 * Utiliza RecyclerView para exibir a lista de filmes
 */
class CatalogFragment : Fragment() {

    private var _binding: FragmentCatalogBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Chamado quando o Fragment é criado
        Log.d("CatalogFragment", "onCreate() - Fragment criado")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d("CatalogFragment", "onCreateView() - View do Fragment criada")
        _binding = FragmentCatalogBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("CatalogFragment", "onViewCreated() - View criada e pronta para usar")
        
        setupRecyclerView()
        loadMovies()
        
        // Exibir no Toast que o Fragment foi ativado
        Toast.makeText(requireContext(), "Catálogo carregado!", Toast.LENGTH_SHORT).show()
    }

    private fun setupRecyclerView() {
        binding.recyclerViewMovies.apply {
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
        }
    }

    private fun loadMovies() {
        val movies = MovieRepository.getAllMovies()
        val adapter = MovieAdapter(movies) { movie ->
            Toast.makeText(
                requireContext(),
                "Você clicou em: ${movie.title}",
                Toast.LENGTH_SHORT
            ).show()
        }
        binding.recyclerViewMovies.adapter = adapter
        binding.textViewCount.text = "Total de filmes: ${movies.size}"
    }

    override fun onStart() {
        super.onStart()
        Log.d("CatalogFragment", "onStart() - Fragment ficou visível")
    }

    override fun onResume() {
        super.onResume()
        Log.d("CatalogFragment", "onResume() - Fragment ganhou foco e está pronto para interação")
    }

    override fun onPause() {
        super.onPause()
        Log.d("CatalogFragment", "onPause() - Fragment deixou de ter foco")
    }

    override fun onStop() {
        super.onStop()
        Log.d("CatalogFragment", "onStop() - Fragment não está mais visível")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("CatalogFragment", "onDestroyView() - View do Fragment foi destruída")
        _binding = null
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("CatalogFragment", "onDestroy() - Fragment foi destruído")
    }

    companion object {
        @JvmStatic
        fun newInstance() = CatalogFragment()
    }
}
