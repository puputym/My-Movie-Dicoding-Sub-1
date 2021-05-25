package com.puput.mymoviesubsatu.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class MovieDataEntity (
        val catalogId: String,
        val judul : String,
        val deskripsi : String,
        val year : String,
        val genre: String,
        val durasi : String,
        val score: String,
        val imgPhoto: Int
): Parcelable
