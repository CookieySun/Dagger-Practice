package kktyu.xyz.daggerpractice

import dagger.BindsInstance
import dagger.Component

@Component
interface Room {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(activity: SecondActivity): Builder

        fun build(): Room
    }

    fun inject(activity: SecondActivity)
}