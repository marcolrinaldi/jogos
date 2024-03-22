package com.marcorinaldi.jogos.dominio.repositorio

import com.marcorinaldi.jogos.dominio.modelo.Jogo

interface RepositorioJogos {

    fun buscarJogo(id: String): Jogo
}