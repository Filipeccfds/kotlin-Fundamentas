package com.filipe.variaveis

class Condicionais {
}

fun main() {
    var a = 2
    var b = 2
    var c = 10

    if (a > b && a >c){
        println("variavel a e menor que as outra variaveis valor")
    } else if ( a >= b ){
        println("variaveis sao iguais")
    } else if ( a > c ){
    println("variaveis a e menor que a variavel c"
    )
    } else{
        println("a variavel a e a menor variavel doseu conjunto")
    }
    // uso do when
    var texto1 = "joao"
    var texto2 = "marcos"
    var texto3 = "lucas"

    var resultado : String = when {
        texto1 == texto2 -> "o texto 1 e o texto 2 são iguais"
        texto1 == texto3 -> "o texto 1 e o texto 3 são iguais"
        texto2 == texto3 -> "o texto 2 e o texto 3 são iguais"
        texto1 != texto3 -> "o texto 1 e o texto 3 nao sao iguais"
        texto2 != texto3 -> "o texto 1 e o texto 2 nao sao iguais"
        else -> "nenhuma das condiçoes foi aceita"
    }

    //em relaçao as condicionais o condicional para assim que  a primeiar condição nao ordem de
    //execução for aceita
    println(resultado)

}

