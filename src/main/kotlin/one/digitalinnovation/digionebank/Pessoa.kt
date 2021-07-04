package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Pessoa 1"
    var cpf: String = "123.132.123-12"
    private set
}

fun main() {
    val fabio = Pessoa()
    println(fabio.nome)
    println(fabio.cpf)

    // fabio.cpf = "54665"
    println(fabio)
}