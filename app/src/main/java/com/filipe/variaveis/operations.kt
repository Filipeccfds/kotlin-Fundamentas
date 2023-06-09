package com.filipe.variables

class operations {
}

fun main() {
    //variaveis a se usar de numeros
    var a:Int = 5
    var b = 2
    var c = "12"
    var def:Double
    def = 20.12
    println(def)
    var d = c.toInt()
    //variaveis de resultado
    var resultado = a +b
    var resultadoDouble = a.toDouble()+ b
    var resultadoDoubleInplicit = (1.0 * a) + b
    var soma = a + d
    //concatenação de string
    var hello = "ola" + " " + "Mundo"
    var meuNome = "Filipe"
    println("ola meu nome é $meuNome")

}