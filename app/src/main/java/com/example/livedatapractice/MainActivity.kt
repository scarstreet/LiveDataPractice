package com.example.livedatapractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.livedatapractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
//    private lateinit var viewModel: Counter

//    var counter:Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        viewModel = ViewModelProvider(this).get(Counter::class.java)
//        binding.counterModel = viewModel
//        binding.lifecycleOwner = this


        var counter = Counter(0)

        binding.addBtn.setOnClickListener{ counter.addOne() }
        binding.resetBtn.setOnClickListener() { counter.reset() }
        counter.counter.observe(this) {
            cnt -> binding.countText.text = cnt.toString()
        }
    }
}