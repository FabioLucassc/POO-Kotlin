package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val joao = Analista("João Analista", "123.123.123-23", 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}