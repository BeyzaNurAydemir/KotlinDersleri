package com.beyzanuraydemir.kotlindersleri.odev2

fun main() {
    val o = Odev2()

    println("****Soru 1****")
    val gelenSicaklik = o.soru1(36.2)
    println("Sıcaklık Değeri : $gelenSicaklik Fahrenhiet")

    println("****Soru 2****")
    val dikdortgenCevre = o.soru2(15,25)

    println("****Soru 3****")
    val faktoriyelSonuc = o.soru3(6)
    println("Faktöriyel Sonucu : $faktoriyelSonuc")

    println("****Soru 4****")
    val harfSayi = o.soru4("deneme",'e')

    println("****Soru 5****")
    val kenarSayisi = o.soru5(9)
    println("Belirtilen çokgenin iç açıları toplamı: $kenarSayisi")

    println("****Soru 6****")
    val maas = o.soru6(25)
    println("Maaş : $maas")

    println("****Soru 7****")
    val kota = o.soru7(45)
    println("İnternet Ücreti : $kota ₺")


}