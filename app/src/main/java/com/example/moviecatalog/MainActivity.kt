package com.example.moviecatalog

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import com.example.moviecatalog.databinding.ActivityMainBinding
import com.example.moviecatalog.ui.about.AboutFragment
import com.example.moviecatalog.ui.catalog.CatalogFragment
import com.example.moviecatalog.ui.favorites.FavoritesFragment

/**
 * MainActivity - Atividade principal que gerencia a navegação Bottom Navigation
 * Demonstra o ciclo de vida de uma Activity
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainActivity", "onCreate() - Atividade criada")
        
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupBottomNavigation()
        
        // Carrega o primeiro Fragment
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                replace(R.id.fragmentContainer, CatalogFragment.newInstance())
            }
        }
    }

    private fun setupBottomNavigation() {
        binding.bottomNavigation.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_catalog -> {
                    Log.d("MainActivity", "Navegando para Catálogo")
                    supportFragmentManager.commit {
                        replace(R.id.fragmentContainer, CatalogFragment.newInstance())
                    }
                    true
                }
                R.id.nav_favorites -> {
                    Log.d("MainActivity", "Navegando para Favoritos")
                    supportFragmentManager.commit {
                        replace(R.id.fragmentContainer, FavoritesFragment.newInstance())
                    }
                    true
                }
                R.id.nav_about -> {
                    Log.d("MainActivity", "Navegando para Sobre")
                    supportFragmentManager.commit {
                        replace(R.id.fragmentContainer, AboutFragment.newInstance())
                    }
                    true
                }
                else -> false
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart() - Atividade ficou visível")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume() - Atividade ganhou foco")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause() - Atividade perdeu foco")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop() - Atividade não está mais visível")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy() - Atividade foi destruída")
    }
}
