package kktyu.xyz.daggerpractice

import dagger.Component

@Component
interface CoffeeShop {
    fun maker(): CoffeeMaker
}