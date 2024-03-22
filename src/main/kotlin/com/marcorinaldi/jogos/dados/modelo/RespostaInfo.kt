package com.marcorinaldi.jogos.dados.modelo

import com.google.gson.annotations.SerializedName

data class RespostaInfo(
    @SerializedName("steamAppID") val id: String,
    @SerializedName("title") val name: String
)
