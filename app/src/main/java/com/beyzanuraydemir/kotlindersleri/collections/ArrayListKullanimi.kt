package com.beyzanuraydemir.kotlindersleri.collections

fun main() {
    val sayilar = ArrayList<Int>()

    val meyveler = ArrayList<String>()

    //Veri Ekleme
    meyveler.add("Elma")  //0. index
    meyveler.add("Muz")   //1. index
    meyveler.add("Kiraz") //2. index

    println(meyveler)

    meyveler[1] = "Yeni Muz"
    println(meyveler)

    meyveler.add(1,"Portakal")
    println(meyveler)

    //Okuma işlemi
    println(meyveler.get(2))
    println(meyveler[3])

    println("Boyut : ${meyveler.size}")
    println("Boyut : ${meyveler.count()}")
    println("Boş Kontrol : ${meyveler.isEmpty()}")
    println("İçeriyor mu : ${meyveler.contains("Kiraz")}")

    meyveler.reverse()
    println(meyveler)

    meyveler.sort()
    println(meyveler)

    //iterating:  değerleri alma for each
    for(meyve in meyveler){
        println("Sonuç 1 : $meyve")
    }

    for((indeks,meyve) in meyveler.withIndex()){
        println("$indeks. -> $meyve")
    }

    meyveler.removeAt(2)
    println(meyveler)

    meyveler.clear()
    println(meyveler)
}