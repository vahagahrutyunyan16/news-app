package com.example.newsapp.ui.home

import android.graphics.Color
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.newsapp.R
import com.example.newsapp.databinding.FragmentHomeBinding
import com.google.android.material.snackbar.Snackbar

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private val newsItems = listOf(
        NewsItem("Short news title will be here", R.drawable.gradient_purple_bordered_bg),
        NewsItem("Short news title will be here", R.drawable.gradient_green_bordered_bg),
        NewsItem("Short news title will be here", R.drawable.gradient_blue_bordered_bg)
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.rvNews.adapter = NewsAdapter(newsItems)

        val text = "Your overall progress is 60%"

        val spannableStringBuilder = SpannableStringBuilder(text)

        val color = Color.rgb(201,63,141)
        spannableStringBuilder.setSpan(
            ForegroundColorSpan(color),
            25,
            28,
            0
        )

        binding.tvOvrProgress.text = spannableStringBuilder

        binding.ivArrowRight.setColorFilter(resources.getColor(R.color.orange_red))

        binding.ivProfile.setOnClickListener {
            findNavController().navigate(R.id.actionHomeToProfile)
        }


        return binding.root
    }
}