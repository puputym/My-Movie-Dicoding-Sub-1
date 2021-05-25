package com.puput.mymoviesubsatu.ui.detail


import androidx.lifecycle.ViewModel
import com.puput.mymoviesubsatu.data.MovieDataEntity
import com.puput.mymoviesubsatu.utils.CatalogueData

class DetailMovieActivityViewModel : ViewModel() {
    private lateinit var catalogid: String
    private lateinit var movie: MovieDataEntity
    private lateinit var tvShow: MovieDataEntity


    fun getDataMovie(): MovieDataEntity {

        val coursesEntities = CatalogueData.generateMovieData()
        for (dataEntity in coursesEntities) {
            if (dataEntity.catalogId == catalogid) {
                movie = dataEntity
            }
        }
        return movie
    }

    fun getDataTvShow(): MovieDataEntity {

        val coursesEntities = CatalogueData.generateTvShow()
        for (dataEntity in coursesEntities) {
            if (dataEntity.catalogId == catalogid) {
                tvShow = dataEntity
            }
        }
        return tvShow
    }

    fun setSelectData(catalogid: String) {
        this.catalogid = catalogid
    }
}