package com.beyzanuraydemir.kotlindersleri.nesnetabanli1.composition

data class Filmler(var film_id: Int,
                   var film_ad: String,
                   var film_yil: Int,
                   var kategori: Kategoriler,
                   var yonetmen:Yonetmenler) {
}