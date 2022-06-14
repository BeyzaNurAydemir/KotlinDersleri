package com.beyzanuraydemir.kotlindersleri.nesnetabanli2

import com.beyzanuraydemir.kotlindersleri.nesnetabanli2.myInterface

class ClassA: myInterface { //implement
    override val degisken: Int = 10


    override fun metot1() {
        println("Metot1 çalıştı")
    }

    override fun metot2() : String {
        return "Metot2 çalıştı"
    }
}