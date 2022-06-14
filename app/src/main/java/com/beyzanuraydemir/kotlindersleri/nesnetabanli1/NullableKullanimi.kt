package com.beyzanuraydemir.kotlindersleri.nesnetabanli1

fun main() {
    //Nullable = Null Safety = Optional(Swift)
    var x = "Merhaba"


    var str1:String? = null

    str1 = "Merhaba"

    //Yöntem 1:
    println("Sonuç 1 : ${str1?.trim()}") //trim önde ve arkadaki boşlukları temizler

    //Yöntem 2:
    //println("Sonuç 2 : ${str1!!.trim()}")

    //Yöntem 3:
    if(str1 != null){
        println("Sonuç 3 : ${str1.trim()}")
    }else{
        println("Sonuç nulldur")
    }

    //Yöntem 4: str1 null değilse çalışır
    str1?.let{
        println("Sonuç 4 : ${str1.trim()}")
    }

}