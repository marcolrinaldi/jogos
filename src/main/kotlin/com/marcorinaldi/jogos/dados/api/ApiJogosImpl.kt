package com.marcorinaldi.jogos.dados.api

import com.google.gson.Gson
import com.marcorinaldi.jogos.dados.modelo.RespostaJogo
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

class ApiJogosImpl : ApiJogos {

    override fun buscarJogo(id: String): RespostaJogo {
        val endereco = "https://www.cheapshark.com/api/1.0/games?id=$id"

        val client: HttpClient = HttpClient.newHttpClient()
        val request = HttpRequest.newBuilder()
            .uri(URI.create(endereco))
            .build()
        val response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString()
        )

        val json = response.body()

        val gson = Gson()
        val resposta = gson.fromJson(json, RespostaJogo::class.java)

        return resposta
    }
}