package delu.game.composelesson2.model

import android.media.Image

data class Employee(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val level: EmployeesLevels,
    val image: Image
)