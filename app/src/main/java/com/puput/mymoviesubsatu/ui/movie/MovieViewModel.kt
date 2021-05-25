package com.puput.mymoviesubsatu.ui.movie

import androidx.lifecycle.ViewModel
import com.puput.mymoviesubsatu.data.MovieDataEntity
import com.puput.mymoviesubsatu.utils.CatalogueData

class MovieViewModel : ViewModel() {
    fun getMovie(): List<MovieDataEntity> = CatalogueData.generateMovieData()
}