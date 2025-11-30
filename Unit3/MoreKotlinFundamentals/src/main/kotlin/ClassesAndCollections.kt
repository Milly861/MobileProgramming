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

val Event.durationOfEvent: String
    get() = if (this.durationInMinutes < 60) {
        "short"
    } else {
        "long"
    }

val Event.isShortEvent: Boolean
    get() = this.durationInMinutes < 60

val Event.durationInHours: Double
    get() = this.durationInMinutes / 60.0

fun main() {
    val events = mutableListOf<Event>()

    events.add(Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0))
    events.add(Event(title = "Eat breakfast", description = null, daypart = Daypart.MORNING, durationInMinutes = 15))
    events.add(Event(title = "Learn about Kotlin", description = null, daypart = Daypart.AFTERNOON, durationInMinutes = 30))
    events.add(Event(title = "Practice Compose", description = null, daypart = Daypart.AFTERNOON, durationInMinutes = 60))
    events.add(Event(title = "Watch latest DevBytes video", description = null, daypart = Daypart.AFTERNOON, durationInMinutes = 10))
    events.add(Event(title = "Check out latest Android Jetpack library", description = null, daypart = Daypart.EVENING, durationInMinutes = 45))

    println("--- Старый способ (повторяющийся код) ---")
    val durationOfEvent = if (events[0].durationInMinutes < 60) {
        "short"
    } else {
        "long"
    }
    println("Duration of first event of the day: $durationOfEvent")

    println("\n--- Новый способ (extension property) ---")
    println("Duration of first event of the day: ${events[0].durationOfEvent}")

    println("\n--- Проверка всех событий ---")
    events.forEachIndexed { index, event ->
        println("Event ${index + 1}: ${event.title} - ${event.durationOfEvent} (${event.durationInMinutes} min)")
    }

    val firstEvent = events[0]
    println("${firstEvent.title}:")
    println("  - Duration category: ${firstEvent.durationOfEvent}")
    println("  - Is short event: ${firstEvent.isShortEvent}")
    println("  - Duration in hours: ${firstEvent.durationInHours}")
}