package com.beyzanuraydemir.kotlindersleri.nesnetabanli2

import kotlin.math.E

fun main() {
    //Kalıtım(Inheritance)=Bir sınıfın özelliğini başka sınıfa aktarması
    val topkapiSarayi = Saray(5,300)
    val bogazVilla = Villa(true,10)

    println(topkapiSarayi.kuleSayisi)  //kendi özelliği
    println(topkapiSarayi.pencereSayisi) //kalıtım yoluyla aldığı özellik

    println(bogazVilla.garajVarmi)
    println(bogazVilla.pencereSayisi)

    //Tip Kontrolü
    if(topkapiSarayi is Saray){
        println("Saraydır")
    }else{
        println("Saray değildir")
    }

    //Upcasting=Alt sınıfın üst sınıfa dönüşmesi
    val ev:Ev = Saray(5,40)

    //DownCating=Üst sınıfın alt sınıfa dönüşmesi. as kelimesi kullanılır.
    val yeniEv = Ev(10)

    val saray = yeniEv as Saray //yeniEv saraya dönüşüyor

}