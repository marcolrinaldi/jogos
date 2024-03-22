package com.marcorinaldi.jogos

import com.marcorinaldi.jogos.dependencias.InjecaoDependencias

fun main() {
    println("### JOGOS MARCO ###")
    print("Digite o ID do jogo: ")

    val id = readln()
    val repositorio = InjecaoDependencias.repositorioJogos()
    val jogo = repositorio.buscarJogo(id)

    println(jogo)
}