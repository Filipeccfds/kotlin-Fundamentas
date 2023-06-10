package com.filipe.variaveis

class Loop {
}

fun main() {
    var array: IntArray = IntArray(20)
    var i = 0
    while ( i <= array.size - 1){
        println(array[i])
        i++
    }

    //o for esta informando enquanto o indice "i" for menor ou igual a array execute o que esta dentro
    //do for
    //se quissese eecutar a variavel resultado fora do for teria que cria a variavel fora do contexto
    //do for e executa-la dentro ex:var resultado = 0.0 / dentro do for resultado = array[j]/ 3.0
    for (j in 0..array.size -1) {
        var resultado: Double = array[j] / 3.0
        println(resultado)
    }


    //outro exemplo
    for(j in array.indices){
        array[j] = j * 2
    println(array[j])
    }
    var result = 0.0
    var  k = 0
    while (k < array.size){
        result += array[k] / 3.0
        k++
    }

    println("resultado das somas = $result")


}