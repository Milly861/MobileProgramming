enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING
}

data class Event(
    val title: String,
    val description: String?,
    val daypart: Daypart,
    val durationInMinutes: Int
)

val studyEvent = Event(
    title = "Study Kotlin",
    description = "Commit to studying Kotlin at least 15 minutes per day.",
    daypart = Daypart.EVENING,
    durationInMinutes = 15
)