package com.puput.mymoviesubsatu.ui.movie

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.puput.mymoviesubsatu.data.MovieDataEntity
import com.puput.mymoviesubsatu.databinding.FragmentMovieBinding
import com.puput.mymoviesubsatu.ui.detail.DetailMovieActivity


class FragmentMovie : Fragment() {

    private lateinit var fragmentMovieBinding: FragmentMovieBinding
    private lateinit var movieAdapter: MovieAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentMovieBinding = FragmentMovieBinding.inflate(inflater, container, false)
        return fragmentMovieBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val viewModel = ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            )[MovieViewModel::class.java]
            movieAdapter = MovieAdapter()
            movieAdapter.setDataMovie(viewModel.getMovie())

            with(fragmentMovieBinding.rvMovie) {
                layoutManager = GridLayoutManager(context, 2)
                setHasFixedSize(true)
                adapter = movieAdapter

                movieAdapter.setOnItemClickCallback(object : MovieAdapter.OnItemClickCallback {
                    override fun onItemClicked(data: MovieDataEntity) {
                        val intent = Intent(context, DetailMovieActivity::class.java)
                        intent.putExtra(DetailMovieActivity.EXTRA_DATA, data.catalogId)
                        intent.putExtra("status", "movie")
                        startActivity(intent)
                    }

                })
            }
        }
    }


}