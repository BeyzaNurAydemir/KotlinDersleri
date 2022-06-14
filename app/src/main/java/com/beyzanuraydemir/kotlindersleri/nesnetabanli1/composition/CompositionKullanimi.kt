package com.beyzanuraydemir.kotlindersleri.nesnetabanli1.composition

fun main() {
    //Composition=Bir sınıf içerisinde başka sınıftan nesne kullanmak
    val k1 = Kategoriler(1,"dram")
    val k2 = Kategoriler(2,"Bilim Kurgu")

    val y1 = Yonetmenler(1,"Quentin Tarantino")
    val y2 = Yonetmenler(2,"Christopher Nalon")

    val f1 = Filmler(1,"Django",2013,k1,y1)

    println("Film id: ${f1.film_id}")
    println("Film ad: ${f1.film_ad}")
    println("Film yil: ${f1.film_yil}")
    println("Film Kategori: ${f1.kategori.kategori_ad}") //k1
    println("Film Yonetmen: ${f1.yonetmen.yonetmen_ad}") //y1
}