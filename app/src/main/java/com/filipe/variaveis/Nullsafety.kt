package com.filipe.variaveis

class Nullsafety {
}

fun main() {
    //para o caso do if a variavel tem que ser imutavel pois se a variavel mudar em alguma parte do codigo
    //dara um erro
    var inteiro:Int?= null
    var inteiro2 = 5
    //ele so soma se for diferente de nulo nesse caso esta explicitando que se o inteiro for diferente de nulo
    //ele sera 0
    var somaDosInteiros = inteiro?:0 + inteiro2
    // ou
    if ( inteiro != null){
        somaDosInteiros = inteiro + inteiro2
    }

    var texto:String? = "filipe"
    var tamanho:Int? =  texto?.length
}