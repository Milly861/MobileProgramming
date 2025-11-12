package com.example.kotlinfundamentals

fun main() {
    val upSong = Song("Music Title", "Author", 2022, 1_000_000)
    upSong.printDescription()
    println(if (upSong.isPopular) "popular song" else "none popular song")

    val unSong = Song("None popular", "Unknown", 2022, 0)
    unSong.printDescription()
    println(if (unSong.isPopular) "popular song" else "none popular song")
}


class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
){
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}