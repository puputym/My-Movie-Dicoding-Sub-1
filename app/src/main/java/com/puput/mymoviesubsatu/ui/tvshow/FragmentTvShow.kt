package com.puput.mymoviesubsatu.ui.tvshow

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.puput.mymoviesubsatu.data.MovieDataEntity
import com.puput.mymoviesubsatu.databinding.FragmentTvShowBinding
import com.puput.mymoviesubsatu.ui.detail.DetailMovieActivity


class FragmentTvShow : Fragment() {
    private lateinit var fragmentTvShowBinding: FragmentTvShowBinding
    private lateinit var tvShowAdapter: TvShowAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentTvShowBinding = FragmentTvShowBinding.inflate(inflater, container, false)
        return fragmentTvShowBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val viewModel = ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            )[TvShowViewModel::class.java]
            tvShowAdapter = TvShowAdapter()
            tvShowAdapter.setDataTvShow(viewModel.getTvShow())
            with(fragmentTvShowBinding.rvTvshow) {
                layoutManager = GridLayoutManager(context, 2)
                setHasFixedSize(true)
                adapter = tvShowAdapter
                tvShowAdapter.setOnItemClickCallback(object :
                    TvShowAdapter.OnItemClickCallbackTvShow {
                    override fun onItemClicked(data: MovieDataEntity) {
                        val intent = Intent(context, DetailMovieActivity::class.java)
                        intent.putExtra(DetailMovieActivity.EXTRA_DATA, data.catalogId)
                        intent.putExtra("status", "tvShow")
                        startActivity(intent)
                    }

                })
            }
        }
    }
}