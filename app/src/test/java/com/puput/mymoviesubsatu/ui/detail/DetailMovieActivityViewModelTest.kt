package com.puput.mymoviesubsatu.ui.detail

import com.puput.mymoviesubsatu.utils.CatalogueData
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

class DetailMovieActivityViewModelTest {

    private lateinit var viewModel: DetailMovieActivityViewModel
    private val movie = CatalogueData.generateMovieData()[0]
    private val tvShow = CatalogueData.generateTvShow()[0]
    private val catalogIdMovie = movie.catalogId
    private val catalogIdTvShow = tvShow.catalogId

    @Before
    fun setUp() {
        viewModel = DetailMovieActivityViewModel()
        viewModel.setSelectData(catalogIdMovie)
        viewModel.setSelectData(catalogIdTvShow)
    }

    @Test
    fun getMovie() {
        viewModel.setSelectData(movie.catalogId)
        val movieEntity = viewModel.getDataMovie()
        assertNotNull(movieEntity)
        assertEquals(movie.catalogId, movieEntity.catalogId)
        assertEquals(movie.imgPhoto, movieEntity.imgPhoto)
        assertEquals(movie.year, movieEntity.year)
        assertEquals(movie.genre, movieEntity.genre)
        assertEquals(movie.durasi, movieEntity.durasi)
        assertEquals(movie.score, movieEntity.score)
        assertEquals(movie.deskripsi, movieEntity.deskripsi)
    }

    @Test
    fun getTvShow() {
        viewModel.setSelectData(tvShow.catalogId)
        val tvShowEntity = viewModel.getDataTvShow()
        assertNotNull(tvShowEntity)
        assertEquals(tvShow.catalogId, tvShowEntity.catalogId)
        assertEquals(tvShow.imgPhoto, tvShowEntity.imgPhoto)
        assertEquals(tvShow.year, tvShowEntity.year)
        assertEquals(tvShow.genre, tvShowEntity.genre)
        assertEquals(tvShow.durasi, tvShowEntity.durasi)
        assertEquals(tvShow.score, tvShowEntity.score)
        assertEquals(tvShow.deskripsi, tvShowEntity.deskripsi)
    }

}