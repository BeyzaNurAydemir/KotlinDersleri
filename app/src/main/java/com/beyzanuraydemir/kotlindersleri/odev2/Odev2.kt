package com.beyzanuraydemir.kotlindersleri.odev2

class Odev2 {
    fun soru1(derece:Double) : Double{
        val sonuc = derece * 1.8 + 32
        return sonuc
    }

    fun soru2(kisaKenar:Int,uzunKenar:Int){
        val cevre = 2 * (kisaKenar + uzunKenar)
        println("Dikdörtgenin Çevresi : $cevre")
    }

    fun soru3(sayi:Int) : Int{
        var i = 1
        var faktoriyel = 1
        while(i <= sayi){
            faktoriyel *= i
            i++
        }
        return faktoriyel
    }

    fun soru4(kelime:String,harf:Char){
        var sayi = 0
        for(i in kelime){
            if(i == harf){
                sayi += 1
            }
        }
        println("Verilen kelime içinde belirtilen harf sayısı : $sayi")
    }

    fun soru5(kenarSayisi:Int) : Int{
        val icAciToplami = (kenarSayisi-2)*180
        return icAciToplami
    }

    fun soru6(gunSayisi:Int) : Int{
        val toplamSaat = gunSayisi * 8
        if(toplamSaat <= 160){
            val maas = 10 * toplamSaat
            return maas
        }else{
            val mesai = toplamSaat - 160
            val mesaiUcret = mesai * 20
            return (mesaiUcret+1600)
        }
    }

    fun soru7(kota:Int) : Int{
        if(kota<=50){
            return 100
        }else {
            val kotaAsim = kota - 50
            return (kotaAsim*4+100)
        }
    }
}