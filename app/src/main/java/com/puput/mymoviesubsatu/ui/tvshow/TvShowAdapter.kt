package com.puput.mymoviesubsatu.ui.tvshow

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.puput.mymoviesubsatu.data.MovieDataEntity
import com.puput.mymoviesubsatu.databinding.ListItemTvshowBinding

class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder>() {
    private var listTvShow = ArrayList<MovieDataEntity>()
    private lateinit var onItemClickCallbackTvShow: OnItemClickCallbackTvShow

    fun setDataTvShow(tvshow: List<MovieDataEntity>?) {
        if (tvshow == null) return
        this.listTvShow.clear()
        this.listTvShow.addAll(tvshow)
    }


    interface OnItemClickCallbackTvShow {
        fun onItemClicked(data: MovieDataEntity)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallbackTvShow) {
        this.onItemClickCallbackTvShow = onItemClickCallback
    }


    inner class TvShowViewHolder(private val binding: ListItemTvshowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(tvShow: MovieDataEntity) {
            with(binding) {
                Glide.with(itemView.context)
                    .load(tvShow.imgPhoto)
                    .apply(RequestOptions().override(200, 250))
                    .into(imgItemPhoto)
                titleMovie.text = tvShow.judul
                score.text = tvShow.score

                itemView.setOnClickListener {
                    onItemClickCallbackTvShow.onItemClicked(tvShow)
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder {
        val itemTvShowBinding =
            ListItemTvshowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvShowViewHolder(itemTvShowBinding)
    }

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
        holder.bind(listTvShow[position])
    }

    override fun getItemCount(): Int = listTvShow.size
}