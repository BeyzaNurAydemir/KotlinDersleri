package com.beyzanuraydemir.kotlindersleri.nesnetabanli2.override_ornek

fun main() {
    //Override=Kalıtım ilişkisinde üst sınıfın metotlarının alt sınıf tarafından tekrar kullanılmasıdır.
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val kopek = Kopek()

    hayvan.sesCikar()//Hayvan sınıfının kendi fonksiyonu
    memeli.sesCikar() //Kalıtım ile üst sınıf fonksiyonu
    kedi.sesCikar() //Kendi fonksiyonu
    kopek.sesCikar()//Kendi fonksiyonu
}