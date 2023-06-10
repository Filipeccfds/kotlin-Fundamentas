package com.filipe.variaveis

import android.support.v4.app.INotificationSideChannel

class Collections {
}

fun main() {
    //array
    var array: Array<Int> = Array(4) {10}
    var array2: DoubleArray = DoubleArray(10){i ->1.0 * i}
    //versao mais reduzida onde o kotlin carrega impliciatmente
    var array3 = Array(2) {12}
    var array4 =  IntArray(1)
    val array5 = intArrayOf(1,2,3)
    

    println(array4)

    array2[2] = 5.2
    array.set(2,12)
    array.size
    array2.get(0)
    println(array2[2])


    //lista
    val lista: List<String> = listOf("kira","l","luffy")
    var mutableLista: MutableList<Int> = mutableListOf()

    //lista forma curta
    var lista1 = listOf<String>("tiago")
    var lista2 = mutableListOf("asas","asa branca")

    lista.size
    lista[2]

    mutableLista.add(0,12)
    mutableLista.add(2)
    mutableLista.add(3)
    mutableLista.add(5)
    mutableLista[0] = 112
    mutableLista.set(3,3)

    mutableLista.remove(1)
    println(mutableLista.get(1))



    //map
    var mapaMutavel: MutableMap<String,Int> = mutableMapOf()
    var mapa:Map<String,String> = mapOf(Pair("joao","lUXAS"),Pair("joaozinho","bicicleta"))
    //map
    var mapa1 = mapOf("book" to 12,"tiago" to 15)

    println(mapa.size)
    println(mapa.get("joaozinho"))
    mapaMutavel["tiago"] = 15
    mapaMutavel.put("lucas",12)
    println( mapaMutavel.contains("lucas"))
    mapaMutavel.set("lucas", 13)
    println(mapaMutavel.containsValue(12))
    println( mapaMutavel)


    //mapaMutavel.set()



}