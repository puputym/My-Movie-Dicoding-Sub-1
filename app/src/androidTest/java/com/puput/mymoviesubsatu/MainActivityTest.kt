package com.puput.mymoviesubsatu

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.puput.mymoviesubdua.ui.main.MainActivity
import com.puput.mymoviesubsatu.utils.CatalogueData
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    private val movie = CatalogueData.generateMovieData()
    private val tvShow = CatalogueData.generateTvShow()

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun loadMovie() {
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                movie.size
            )
        )
    }

    @Test
    fun loadDetailActivityMovie() {
        onView(withId(R.id.rv_movie)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.img_item_photo)).check(matches(isDisplayed()))
        onView(withId(R.id.title)).check(matches(isDisplayed()))
        onView(withId(R.id.title)).check(matches(withText(movie[0].judul)))
        onView(withId(R.id.year)).check(matches(isDisplayed()))
        onView(withId(R.id.year)).check(matches(withText(movie[0].year)))
        onView(withId(R.id.genre)).check(matches(isDisplayed()))
        onView(withId(R.id.genre)).check(matches(withText(movie[0].genre)))
        onView(withId(R.id.durasi)).check(matches(isDisplayed()))
        onView(withId(R.id.durasi)).check(matches(withText(movie[0].durasi)))
        onView(withId(R.id.score)).check(matches(isDisplayed()))
        onView(withId(R.id.score)).check(matches(withText(movie[0].score)))
        onView(withId(R.id.tv_desc)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_desc)).check(matches(withText(movie[0].deskripsi)))
    }

    @Test
    fun loadTvShow() {
        onView(withText(R.string.tv_show)).perform(click())
        onView(withId(R.id.rv_tvshow)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tvshow)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                tvShow.size
            )
        )
    }

    @Test
    fun loadDetailActivityTvShow() {
        onView(withText(R.string.tv_show)).perform(click())
        onView(withId(R.id.rv_tvshow)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.img_item_photo)).check(matches(isDisplayed()))
        onView(withId(R.id.title)).check(matches(isDisplayed()))
        onView(withId(R.id.title)).check(matches(withText(tvShow[0].judul)))
        onView(withId(R.id.year)).check(matches(isDisplayed()))
        onView(withId(R.id.year)).check(matches(withText(tvShow[0].year)))
        onView(withId(R.id.genre)).check(matches(isDisplayed()))
        onView(withId(R.id.genre)).check(matches(withText(tvShow[0].genre)))
        onView(withId(R.id.durasi)).check(matches(isDisplayed()))
        onView(withId(R.id.durasi)).check(matches(withText(tvShow[0].durasi)))
        onView(withId(R.id.score)).check(matches(isDisplayed()))
        onView(withId(R.id.score)).check(matches(withText(tvShow[0].score)))
        onView(withId(R.id.tv_desc)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_desc)).check(matches(withText(tvShow[0].deskripsi)))

    }

}