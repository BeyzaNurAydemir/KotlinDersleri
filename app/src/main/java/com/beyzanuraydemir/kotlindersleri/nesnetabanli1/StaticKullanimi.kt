package com.beyzanuraydemir.kotlindersleri.nesnetabanli1

fun main() {
    val a = ASinifi()  //Nesne

    //println(a.x)

    //a.metod()
    println(ASinifi.x)  //static olduğu için direkt erişti nesne oluşturmaya gerek kalmadı

    ASinifi.metod()

    //sanalnesne = nesneye isim vermeden nesne ile çalışan

    println(ASinifi().x1)

    ASinifi().metod1()

    //Parantez varsa -> Sanal Nesne
    //Parantez yoksa -> Static
}