package com.example.newsapp.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.newsapp.R
import com.example.newsapp.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)

        binding.imageView4.setColorFilter(resources.getColor(R.color.purple_navy))
        binding.imageView3.setColorFilter(resources.getColor(R.color.zomp))
        binding.ivVector1.setColorFilter(resources.getColor(R.color.zomp))
        binding.ivVector2.setColorFilter(resources.getColor(R.color.orange_red))
        binding.ivVector3.setColorFilter(resources.getColor(R.color.smitten))

        return binding.root
    }

}