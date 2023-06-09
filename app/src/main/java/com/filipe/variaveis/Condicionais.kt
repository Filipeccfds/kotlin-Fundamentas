package com.filipe.variaveis

class Condicionais {
}

fun main() {
    var a = 2
    var b = 2
    var c = 10

    if (a > b && a >c){
        println("A variavel *A* e menor que as outras variaveis")
    } else if ( a >= b ){
        println("A variavel *A* e a variavel *B* são iguais")
    } else if ( a > c ){
    println("A variavel *A* e menor que a variavel *C*"
    )
    } else{
        println("a variavel *A* e a menor variavel do seu conjunto")
    }
    // uso do when
    var texto1 = "joao"
    var texto2 = "marcos"
    var texto3 = "lucas"

    var resultado : String = when {
        texto1 == texto2 -> "o texto 1 e o texto 2 são iguais"
        texto1 == texto3 -> "o texto 1 e o texto 3 são iguais"
        texto2 == texto3 -> "o texto 2 e o texto 3 são iguais"
        texto1 != texto3 -> "o texto 1 e o texto 3 nao são iguais"
        texto2 != texto3 -> "o texto 1 e o texto 2 nao são iguais"
        else -> "nenhuma das condições foi aceita"
    }

    //em relaçao as condicionais: o condicional para, assim que  a primeira condição na ordem de
    //execução for aceita
    println(resultado)

}

