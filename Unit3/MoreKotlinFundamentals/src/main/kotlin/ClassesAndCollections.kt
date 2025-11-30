package main.kotlin

data class Event(
    val title: String,
    val description: String?,
    val daypart: String,
    val durationInMinutes: Int
)

val studyEvent = Event(
    title = "Study Kotlin",
    description = "Commit to studying Kotlin at least 15 minutes per day.",
    daypart = "Evening",
    durationInMinutes = 15
)

fun main() {
    println(studyEvent)
}