package com.beyzanuraydemir.kotlindersleri.degiskenler

fun main() {
    var ogrenciAdi = "Ahmet"
    var ogrenciYas = 24
    var ogrenciBoy = 1.98
    var ogrenciBasharf = 'A'
    var ogrenciDevamEdiyorMu = true

    println(ogrenciAdi)
    println(ogrenciYas)
    println(ogrenciBoy)
    println(ogrenciBasharf)
    println(ogrenciDevamEdiyorMu)

    var urun_id:Int = 2416
    var urun_ad:String = "Kol saati"
    val urun_adet:Int = 100
    var urun_fiyat:Double = 149.99
    var urun_tedarikci:String = "rolex"

    println("Ürün id: $urun_id")
    println("Ürün ad: $urun_ad")
    println("Ürün adet: $urun_adet")
    println("Ürün fiyat: $urun_fiyat ₺")
    println("Ürün tedarikçi: $urun_tedarikci")

    var a = 10
    var b = 20
    println("$a x $b: ${a*b}")  //birden fazla işlem varsa {}

    //Sabitler
    var sayi = 30
    println(sayi)
    sayi = 100
    println(sayi)

    val numara = 90  //val = final = let = const
    println(numara)

    //Tür Dönüşümü

    //Sayısaldan sayısala dönüşüm
    val i = 42
    val d = 78.95

    val sonuc1 = i.toDouble()
    println(sonuc1)

    val sonuc2 = d.toInt()
    println(sonuc2)

    //Sayısaldan metine dönüşüm
    val sonuc3 = i.toString()  //"42"
    val sonuc4 = d.toString()  //"78.98"
    println(sonuc3)
    println(sonuc4)

    //Metinden sayısala dönüşüm
    val yazi = "97.95x"

    val sonuc5 = yazi.toDoubleOrNull() //sorun yoksa double dönüştür varsa null döndür
    if(sonuc5 != null){
        println(sonuc5)
    }else{
        println("Dönüşümde hata oluştu.")
    }

    //nullable gibi yapıları kontrol etmek için kullanılır.
    sonuc5?.let {
        println(sonuc5)
    }


}