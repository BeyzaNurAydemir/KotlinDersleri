package com.beyzanuraydemir.kotlindersleri.nesnetabanli1

fun main() {
    val bmw = Araba("Kırmızı",0, false)
    //Değer okuma
    bmw.bilgiAl()
    //Değer atama
    bmw.renk = "Mavi"
    bmw.hiz = 5
    bmw.calisiyorMu = true

    bmw.bilgiAl()
    bmw.durdur()
    bmw.bilgiAl()


    val sahin = Araba("Beyaz", 100, true)
    sahin.bilgiAl()
    sahin.durdur()
    sahin.bilgiAl()
    sahin.calistir()
    sahin.bilgiAl()
    sahin.hizlan(30)
    sahin.bilgiAl()
    sahin.yavasla(10)
    sahin.bilgiAl()

}