# Movie Catalog - Aplicativo Android em Kotlin

## 📽️ Descrição do Projeto

Movie Catalog é um aplicativo Android desenvolvido em Kotlin que funciona como um catálogo de filmes. O aplicativo demonstra a implementação prática de conceitos fundamentais de desenvolvimento Android.

## ✨ Conceitos Implementados

### 1. **Bottom Navigation**
- Localizado na parte inferior da tela
- Permite navegação entre três telas/fragmentos principais
- Ícones e rótulos para cada seção

### 2. **Data Class (Classe de Dados)**
- `Movie.kt` - Classe de dados que representa um filme
- Propriedades: id, title, year, rating, description, genre, imageUrl
- Geração automática de equals(), hashCode(), toString(), copy()

### 3. **Entidade (Entity)**
- A classe `Movie` atua como entidade do domínio
- Representa um objeto do sistema (filme)
- Estrutura bem definida com dados imutáveis

### 4. **RecyclerView**
- Implementada em dois fragmentos diferentes
- CatalogFragment: Lista linear (LinearLayoutManager)
- FavoritesFragment: Grade (GridLayoutManager)
- MovieAdapter: Gerencia a exibição eficiente da lista

### 5. **Fragments**
- **CatalogFragment**: Exibe o catálogo completo de filmes (12 filmes)
- **FavoritesFragment**: Exibe filmes com rating ≥ 8.6
- **AboutFragment**: Informações sobre o aplicativo
- Cada Fragment gerencia seu próprio ciclo de vida

### 6. **Ciclo de Vida**
Demonstrado através de Logs em cada Fragment e Activity:
- `onCreate()` - Inicialização básica
- `onStart()` - Fragment ficou visível
- `onResume()` - Fragment pronto para interação
- `onPause()` - Fragment perdeu foco
- `onStop()` - Fragment não está mais visível
- `onDestroyView()` - View foi destruída
- `onDestroy()` - Fragment foi destruído

**Para visualizar os logs:**
- Abra o Android Studio
- Vá para View → Tool Windows → Logcat
- Procure por "Fragment" ou "MainActivity"
- Mude entre as abas para ver os logs de cada evento



## 🚀 Como Executar

### Pré-requisitos
- Android Studio (versão 2021.1 ou superior)
- JDK 11 ou superior
- SDK Android 34 (compileSdk)
- Min SDK 24 (API 24 - Android 7.0)

### Passos

1. **Abrir o projeto no Android Studio**
   - File → Open
   - Selecione a pasta `movie-catalog`

2. **Aguarde o Gradle sincronizar**
   - Android Studio fará o download das dependências automaticamente

3. **Executar o aplicativo**
   - Opção 1: Emulador
     - Abra o AVD Manager (Tools → AVD Manager)
     - Crie ou selecione um emulador
     - Clique no botão ▶ Run (verde)
   - Opção 2: Dispositivo físico
     - Conecte um dispositivo Android via USB
     - Ative o modo de desenvolvedor no dispositivo
     - Clique no botão ▶ Run (verde)

4. **Interagir com o app**
   - Clique nas abas do Bottom Navigation para mudar de tela
   - Clique em qualquer filme para ver um Toast
   - Verifique os Logs (View → Tool Windows → Logcat) para ver o ciclo de vida

## 📊 Dados de Exemplo

O aplicativo inclui 12 filmes de exemplo:

| Título | Ano | Rating | Gênero |
|--------|-----|--------|--------|
| A Origem | 2010 | 8.8 | Ficção Científica |
| Interestelar | 2014 | 8.6 | Ficção Científica |
| O Cavaleiro das Trevas | 2008 | 9.0 | Ação/Crime |
| Pulp Fiction | 1994 | 8.9 | Crime/Drama |
| Matrix | 1999 | 8.7 | Ficção Científica |
| Parasita | 2019 | 8.6 | Drama/Thriller |
| Oppenheimer | 2023 | 8.3 | Drama/História |
| Barbie | 2023 | 7.9 | Comédia/Fantasia |
| Gattaca | 1997 | 8.1 | Ficção Científica |
| Cidade de Deus | 2002 | 8.8 | Drama |
| Clube da Luta | 1999 | 8.8 | Drama/Thriller |
| Inception | 2010 | 8.8 | Ficção Científica |

## 🎯 Funcionalidades

- ✅ Navegação com Bottom Navigation
- ✅ Lista de filmes com RecyclerView
- ✅ Filtro de filmes favoritos (rating ≥ 8.6)
- ✅ Layout responsivo e moderno
- ✅ Informações sobre cada filme
- ✅ Logs de ciclo de vida
- ✅ Design inspirado no Letterboxd

## 🛠️ Tecnologias Utilizadas

- Kotlin
- Android SDK 34
- AndroidX
- Material Components
- RecyclerView
- Fragments
- ViewBinding
- Coroutines

## 📝 Requisitos da Atividade - ✅ Cumpridos

- ✅ Aplicativo em Kotlin
- ✅ Bottom Navigation para navegação
- ✅ 2+ Fragments diferentes (Catálogo, Favoritos, Sobre)
- ✅ RecyclerView implementada com lista de filmes
- ✅ Data class (Movie) utilizada
- ✅ Entidade (Movie) representando filmes
- ✅ Ciclo de vida demonstrado com Logs
- ✅ Aplicativo funcional no emulador
- ✅ Código organizado e bem estruturado

## 📄 Licença

Este projeto é fornecido para fins educacionais como parte de uma atividade acadêmica.

---

**Desenvolvido com ❤️ em Kotlin**
