package com.example.upschoolbootcampodevler

import java.util.*
import kotlin.random.Random

fun main ()
{
    var guessRight = 3
    val random = Random.nextInt(0,101)

    println("**Tahmin ettiğim sayıyı bulabilir misin**")

    while (guessRight > 0) {
        val input = Scanner(System.`in`)
        val guess = input.nextInt()

        if (guess!=null)
        {
            if (guess < random)
            {
                guessRight--
                println("Imm tutturamadın. Çık biraz")
            }
            else if (guess == random)
            {
                guessRight--
                println("Bravoo etkilendim tahminin doğru")
                break
            }

            else
            {
                guessRight--
                println("Imm tutturamadınn. Daha küçük bir sayı ile denemelisinn")
            }
            if (guessRight>0)
            {
                println("Sence tuttuğum sayı nedir. Bul bakalım.")
            }
            else
            {
                println("Tahmin hakkın bitti.. Tuttuğum sayı : $random")
                println("Seninle oynamak keyifliydi.")
            }

        }
        else
        {
            guessRight--
            if (guessRight>0){
                println("Kalan tahmin hakkın $guessRight")
                print("Geçerli bir sayı gir: ")
            }else{
                println("Tahmin hakkın bitti.. Tuttuğum sayı : $random")
                println("Seninle oynamak keyifliydi.")
            }
        }

    }


}