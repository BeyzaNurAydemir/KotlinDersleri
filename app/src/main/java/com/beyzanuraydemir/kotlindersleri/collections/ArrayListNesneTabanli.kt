package com.beyzanuraydemir.kotlindersleri.collections

fun main() {
    val o1 = Ogrenciler(200,"Zeynep","9C")
    val o2 = Ogrenciler(300,"Ahmet","11Z")
    val o3 = Ogrenciler(100,"Beyza","12A")

    val ogrencilerListesi = ArrayList<Ogrenciler>()
    ogrencilerListesi.add(o1)
    ogrencilerListesi.add(o2)
    ogrencilerListesi.add(o3)

    for(o in ogrencilerListesi){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif}")
    }

    //Sayısal Sıralama
    println("Sayısal : Küçükten -> Büyüğe")
    val siralama1 = ogrencilerListesi.sortedWith(compareBy { it.no })
    for(o in siralama1){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif}")
    }

    println("Sayısal : Büyükten -> Küçüğe")
    val siralama2 = ogrencilerListesi.sortedWith(compareByDescending { it.no })
    for(o in siralama2){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif}")
    }

    //Harfsel Sıralama
    println("Harfsel : Küçükten -> Büyüğe")
    val siralama3 = ogrencilerListesi.sortedWith(compareBy { it.ad })
    for(o in siralama3){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif}")
    }

    println("Harfsel : Büyükten -> Küçüğe")
    val siralama4 = ogrencilerListesi.sortedWith(compareByDescending { it.ad })
    for(o in siralama4){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif}")
    }

    //Filtreleme
    println("Filtreleme 1")
    val filtreleme1 = ogrencilerListesi.filter { it.no >= 200 }
    for(o in filtreleme1){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif}")
    }

    println("Filtreleme 2")
    val filtreleme2 = ogrencilerListesi.filter { (it.ad).contains("yz") }
    for(o in filtreleme2){
        println("No : ${o.no} - Ad : ${o.ad} - Sınıf : ${o.sinif}")
    }
}