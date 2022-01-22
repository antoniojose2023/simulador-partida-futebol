package br.com.antoniojose.simuladorpartidafutebol.domain

data class Matches(
    var description: String,
    var place: Place,
    var teamHome: Team,
    var teamVisitant: Team
) {
}