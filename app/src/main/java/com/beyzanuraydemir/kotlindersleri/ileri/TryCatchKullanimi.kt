package com.beyzanuraydemir.kotlindersleri.ileri

fun main() {
    val x = 10
    val y = 5

    try{
        println("Sonuç : ${x/y}")
        println("İşlem tamam")
    }catch (e:Exception){
        println("İkinci sayı sıfır olamaz")
    }
}