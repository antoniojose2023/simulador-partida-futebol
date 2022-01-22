package br.com.antoniojose.simuladorpartidafutebol.domain

data class Team(
    var name: String,
    var forca: Int,
    var urlImagem: String,
    var placar: Int
) {
}