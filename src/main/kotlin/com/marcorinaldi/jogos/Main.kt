package com.marcorinaldi.jogos

import com.marcorinaldi.jogos.dados.repositorio.RepositorioJogosImpl
import com.marcorinaldi.jogos.dominio.repositorio.RepositorioJogos

fun main() {
    println("### JOGOS MARCO ###")
    print("Digite o ID do jogo: ")

    val id = readln()
    val repositorio: RepositorioJogos = RepositorioJogosImpl()
    val jogo = repositorio.buscarJogo(id)

    println(jogo)
}