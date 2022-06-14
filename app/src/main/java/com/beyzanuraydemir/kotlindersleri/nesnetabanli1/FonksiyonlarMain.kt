package com.beyzanuraydemir.kotlindersleri.nesnetabanli1

fun main(){
    val f = Fonksiyonlar()
    f.selamla1()

    val gelenSonuc = f.selamla2()
    println("Gelen Sonuç : $gelenSonuc")

    f.selamla3("Aylin")

    val gelenToplam = f.toplama(10,20)
    println("Gelen Toplam : $gelenToplam")

    f.carp(3,4,"Ece")
}