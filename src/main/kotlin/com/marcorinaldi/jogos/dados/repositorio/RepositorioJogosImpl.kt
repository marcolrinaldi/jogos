package com.marcorinaldi.jogos.dados.repositorio

import com.marcorinaldi.jogos.dados.api.ApiJogos
import com.marcorinaldi.jogos.dados.api.ApiJogosImpl
import com.marcorinaldi.jogos.dominio.modelo.Jogo
import com.marcorinaldi.jogos.dominio.repositorio.RepositorioJogos

class RepositorioJogosImpl : RepositorioJogos {


    override fun buscarJogo(id: String): Jogo {
        val api: ApiJogos =ApiJogosImpl()
        val resposta = api.buscarJogo(id)
        val jogo = Jogo(
            id = resposta.info.id,
            nome = resposta.info.nome
        )

        return jogo
    }
}