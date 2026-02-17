package com.example.airplane

class plane(
    var marka: String,
    var otprav: String,
    var naznach: String,
    var Data: String,
    var time: String,
    var timeput: Int
) {
fun printInfo() {
    println("️ Информация о рейсе:")
    println("   Марка самолета: $marka")
    println("   Отправление из: $otprav")
    println("   Назначение: $naznach")
    println("   Дата отправления: $Data")
    println("   Время отправления: $time")
    println("   Время в пути: ${formatTimePut()}")
    println("   ───────────────────")
}

private fun formatTimePut(): String {
    val hours = timeput / 60
    val minutes = timeput % 60

    return when {
        hours > 0 && minutes > 0 -> "$hours ч $minutes мин"
        hours > 0 -> "$hours ч"
        else -> "$minutes мин"
    }
}


fun isInternational(): Boolean {
    val hasCyrillic = { s: String -> s.any { it in 'А'..'я' } }
    return hasCyrillic(otprav) != hasCyrillic(naznach)
}


fun getDurationInMinutes() = timeput


fun updateTime(newTime: String) {
    time = newTime
}
}