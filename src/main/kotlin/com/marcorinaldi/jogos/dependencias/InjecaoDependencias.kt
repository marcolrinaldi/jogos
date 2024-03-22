package com.marcorinaldi.jogos.dependencias

import com.marcorinaldi.jogos.dados.api.ApiJogos
import com.marcorinaldi.jogos.dados.api.ApiJogosImpl

object InjecaoDependencias {

    fun apiJogos(): ApiJogos {
        return ApiJogosImpl()
    }
}