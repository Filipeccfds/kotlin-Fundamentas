package com.filipe.variaveis

import android.support.v4.app.INotificationSideChannel

class Collections {
}

fun main() {
    //array
    var array: Array<Int> = Array(4) {10}
    var array2: DoubleArray = DoubleArray(10){i ->1.0 * i}

    array2[2] = 5.2
    array.set(2,12)
    array.size
    array2.get(0)
    println(array2[2])


    //lista
    val lista: List<String> = listOf("kira","l","luffy")
    var mutableLista: MutableList<Int> = mutableListOf()

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