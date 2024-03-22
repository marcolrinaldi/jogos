package com.marcorinaldi.jogos.dados.api

import com.marcorinaldi.jogos.dados.modelo.RespostaJogo

interface ApiJogos {

    fun buscarJogo(id: String): RespostaJogo
}
