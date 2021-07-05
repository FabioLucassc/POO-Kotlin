package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val maria = Gerente("maria do carmo", "123.123.123-23", 5000.0)
    ImprimeRelatorioFuncionario.imprime(maria)
}

//fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())