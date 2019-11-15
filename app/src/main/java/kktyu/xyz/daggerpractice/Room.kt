package kktyu.xyz.daggerpractice

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule

@Component/*(modules = [AndroidInjectionModule::class, RoomModule::class])*/
interface Room {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(activity: SecondActivity): Builder

        fun build(): Room
    }

    fun inject(activity: SecondActivity)
}