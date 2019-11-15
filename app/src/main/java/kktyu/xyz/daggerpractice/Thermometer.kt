package kktyu.xyz.daggerpractice

import javax.inject.Inject

class Thermometer @Inject constructor(val activity: SecondActivity) {
    fun getTemperature(): String {
        return activity.getString(R.string.temperature)
    }
}