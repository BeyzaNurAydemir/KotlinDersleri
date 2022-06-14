package com.beyzanuraydemir.kotlindersleri.nesnetabanli1

fun main() {
    ucretHesapla(100,KonserveBoyut.ORTA)
}

fun ucretHesapla(adet: Int,boyut: KonserveBoyut) {
    when(boyut){
        KonserveBoyut.KUCUK ->
            println("Toplam Maliyet: ${30 *adet} ₺")
        KonserveBoyut.ORTA ->
            println("Toplam Maliyet: ${80 *adet} ₺")
        KonserveBoyut.BUYUK ->
            println("Toplam Maliyet: ${140 *adet} ₺")
    }
}