package com.puput.mymoviesubsatu.ui.detail

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.puput.mymoviesubsatu.R
import com.puput.mymoviesubsatu.data.MovieDataEntity
import com.puput.mymoviesubsatu.databinding.ActivityDetailMovieBinding


class DetailMovieActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityDetailMovieBinding

    companion object {
        const val EXTRA_DATA = "extra_data"
        const val EXTRA_ID = "extra_data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.back.setOnClickListener(this)
        binding.share.setOnClickListener(this)

        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[DetailMovieActivityViewModel::class.java]


        val id = intent.getStringExtra(EXTRA_ID)

        viewModel.setSelectData(id.toString())

        val dataMovie: MovieDataEntity
        val status = intent.getStringExtra("status")
        if (status == "movie") {
            dataMovie = viewModel.getDataMovie()
        } else {
            dataMovie = viewModel.getDataTvShow()
        }


        binding.apply {

            title.text = dataMovie.judul
            year.text = dataMovie.year
            genre.text = dataMovie.genre
            durasi.text = dataMovie.durasi
            score.text = dataMovie.score
            tvDesc.text = dataMovie.deskripsi

            Glide.with(this@DetailMovieActivity)
                .load(dataMovie.imgPhoto)
                .apply(RequestOptions().override(200, 250))
                .into(imgItemPhoto)


        }
    }
    val sendIntent: Intent = Intent().apply {
        action = Intent.ACTION_SEND
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.back -> {
                finish()
            }
            R.id.share -> {
                startActivity(Intent.createChooser(sendIntent, null))
            }
        }
    }
}