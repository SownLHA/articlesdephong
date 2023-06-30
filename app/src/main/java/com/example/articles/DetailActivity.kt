package com.example.articles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.articles.databinding.ActivityDetailBinding


class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val image = intent.getParcelableExtra<Image>(MainActivity.ARTICLES)

        if (image != null) {
            binding.imageDetail.setImageResource(image.imageSrc)
            binding.imageTitle.text = image.imageTitle
            binding.imageDesc.text = image.imageDesc
        }
    }
}
