package kktyu.xyz.daggerpractice

import javax.inject.Inject

class CoffeeMaker @Inject constructor(val heater:Heater){
    fun getTemperature(): String {
        return heater.getTemperature()
    }
}