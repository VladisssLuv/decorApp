package com.hackathon.decor.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.hackathon.decor.databinding.AuthLayoutBinding

class FragmentLogIn: Fragment() {
    private val binding: AuthLayoutBinding by lazy { AuthLayoutBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.button.setOnClickListener { onClickButton() }
    }

    private fun onClickButton() {
        Log.d("FragmentLogIn", "click")
    }
}