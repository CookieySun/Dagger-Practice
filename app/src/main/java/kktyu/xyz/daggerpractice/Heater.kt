package kktyu.xyz.daggerpractice

import javax.inject.Inject

class Heater @Inject constructor() {
    fun getTemperature(): String {
        return "90℃"
    }
}
