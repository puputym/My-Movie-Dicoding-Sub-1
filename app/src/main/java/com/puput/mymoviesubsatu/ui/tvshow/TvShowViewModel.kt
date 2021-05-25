package com.puput.mymoviesubsatu.ui.tvshow

import androidx.lifecycle.ViewModel
import com.puput.mymoviesubsatu.data.MovieDataEntity
import com.puput.mymoviesubsatu.utils.CatalogueData

class TvShowViewModel : ViewModel() {

    fun getTvShow(): List<MovieDataEntity> = CatalogueData.generateTvShow()

}