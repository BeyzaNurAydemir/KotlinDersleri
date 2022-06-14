package com.beyzanuraydemir.kotlindersleri.nesnetabanli1

fun main() {
    val sonuc = 5 carpi 2 //5.carpi(2)
    println("Gelen Sonuç : $sonuc")
}

infix fun Int.carpi(sayi:Int) : Int{
    return this * sayi  //Int sınıfından bir deger ile sayıyı çarp
    //this = sınıfın kendisi, yapının kendisi = self
}