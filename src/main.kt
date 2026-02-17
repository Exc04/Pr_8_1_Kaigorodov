package com.example.airplane

fun main() {
    println("Система управления рейсами\n")


    val flight1 = plane(
        marka = "Boeing 737-800",
        otprav = "Москва",
        naznach = "Пермь",
        Data = "17.02.2026",
        time = "08:30",
        timeput = 75
    )

    val flight2 = plane(
        marka = "Airbus A320",
        otprav = "Екатеринбург",
        naznach = "Москва",
        Data = "17.02.2026",
        time = "12:45",
        timeput = 85
    )

    val flight3 = plane(
        marka = "Embraer E190",
        otprav = "Санкт-Питербург",
        naznach = "Варшава",
        Data = "18.02.2026",
        time = "15:20",
        timeput = 130
    )


    val flights = listOf(flight1, flight2, flight3)

    for (i in flights.indices) {
        println("Рейс #${i + 1}")
        flights[i].printInfo()
    }

    println("\nСписок всех рейсов:")
    for (flight in flights) {
        println("• ${flight.marka}: ${flight.otprav} → ${flight.naznach} (${flight.time})")
    }
}