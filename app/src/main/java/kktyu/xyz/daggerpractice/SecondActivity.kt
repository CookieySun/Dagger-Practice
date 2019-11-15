package kktyu.xyz.daggerpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import kktyu.xyz.daggerpractice.databinding.ActivitySecondBinding
import javax.inject.Inject

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    private val viewModel = SecondViewModel()
    private lateinit var room: Room

    @Inject
    lateinit var thermometer: Thermometer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second)

        room = DaggerRoom.builder().application(this).build()

        room.inject(this)

        viewModel.textView = thermometer.getTemperature()

        binding.textView.text = viewModel.textView
    }
}
