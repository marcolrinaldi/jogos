package com.marcorinaldi.jogos.dependencias

import com.marcorinaldi.jogos.dados.api.ApiJogos
import com.marcorinaldi.jogos.dados.api.ApiJogosImpl
import com.marcorinaldi.jogos.dados.repositorio.RepositorioJogosImpl
import com.marcorinaldi.jogos.dominio.repositorio.RepositorioJogos

object InjecaoDependencias {

    fun apiJogos(): ApiJogos {
        return ApiJogosImpl()
    }

    fun repositorioJogos(): RepositorioJogos {
        return RepositorioJogosImpl()
    }
}