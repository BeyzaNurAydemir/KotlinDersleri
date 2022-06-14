package com.beyzanuraydemir.kotlindersleri.nesnetabanli1

class Araba(var renk:String, var hiz:Int, var calisiyorMu:Boolean) {

    init {//Constructor : Primary Constructor
        println("Nesne oluştu")
    }

    fun calistir(){//Side effect : fonksiyon ile sınıf değişkenini değiştirme
        calisiyorMu = true
        hiz = 5
    }

    fun durdur(){
        calisiyorMu = false
        hiz = 0
    }

    fun hizlan(kacKm:Int){
        hiz += kacKm  //hiz = hiz + kacKm
    }

    fun yavasla(kacKm:Int){
        hiz -= kacKm //hiz = hiz - kacKm
    }

    fun bilgiAl(){//bmw.bilgiAl()
        println("**************************")
        println("Renk : ${renk}")
        println("Hız : ${hiz}")
        println("Çalışıyor Mu : ${calisiyorMu}")
    }

}