package com.example.moviecatalog.ui.about

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.moviecatalog.databinding.FragmentAboutBinding

/**
 * Fragment que exibe informações sobre o aplicativo
 * Demonstra o ciclo de vida de um Fragment
 */
class AboutFragment : Fragment() {

    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("AboutFragment", "onCreate() - Fragment criado")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Log.d("AboutFragment", "onCreateView() - View do Fragment criada")
        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("AboutFragment", "onViewCreated() - View criada e pronta para usar")
        
        binding.textViewAboutContent.text = """
            📽️ Movie Catalog
            
            Versão: 1.0
            
            Sobre o App:
            Catálogo de filmes desenvolvido em Kotlin para Android. Explore filmes, veja suas informações e marque seus favoritos.
            
            Conceitos Implementados:
            • Bottom Navigation - Navegação entre abas
            • Data Class - Classe Movie para armazenar dados
            • RecyclerView - Listagem de filmes
            • Fragments - Múltiplas telas
            • Ciclo de vida - Observado via Logs
            
            Desenvolvido com ❤️ em Kotlin
        """.trimIndent()
    }

    override fun onStart() {
        super.onStart()
        Log.d("AboutFragment", "onStart() - Fragment ficou visível")
    }

    override fun onResume() {
        super.onResume()
        Log.d("AboutFragment", "onResume() - Fragment pronto para interação")
    }

    override fun onPause() {
        super.onPause()
        Log.d("AboutFragment", "onPause() - Fragment deixou de ter foco")
    }

    override fun onStop() {
        super.onStop()
        Log.d("AboutFragment", "onStop() - Fragment não está mais visível")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("AboutFragment", "onDestroyView() - View do Fragment foi destruída")
        _binding = null
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("AboutFragment", "onDestroy() - Fragment foi destruído")
    }

    companion object {
        @JvmStatic
        fun newInstance() = AboutFragment()
    }
}
