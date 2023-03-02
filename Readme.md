#Halaman Utama
Syarat:
Menampilkan gambar dalam format List dengan jumlah minimal 10 item yang berbeda. Gunakanlah RecyclerView untuk menyusun listnya. Informasi yang ditampilkan mengandung :

#Judul dari artikel

Memaparkan overview dari artikel (opsional)

Memunculkan halaman detail ketika salah satu item ditekan. Anda bisa menerapkan handler click pada setiap item RecyclerView
Halaman Detail
Syarat:

Menampilkan gambar dan informasi yang relevan pada halaman detail. 

Informasi yang relevan mencakup kesamaan informasi yang ditampilkan pada halaman utama dengan halaman detail
Terdapat judul dan gambar yang sesuai dengan list

Terdapat informasi tambahan yang tidak sama dengan list

#Halaman About
Syarat:

Menampilkan foto diri, nama, dan email yang terdaftar di Dicoding.

Dalam mengakses halaman about, pastikan terdapat tombol yang bisa digunakan untuk mengakses halamannya. Untuk cara mengaksesnya, kamu bisa mengimplementasikan :
Dengan menambahkan elemen View khusus (bisa option menu, tombol, atau tab) yang mengandung ID “about_page”
=================Pada Unit Testing============================

MovieViewModelTest:

->Memuat movie

1.Memastikan data movie tidak null.

2.Memastikan jumlah data movie sesuai dengan yang diharapkan yaitu 10.

TvShowViewModelTest:

->Memuat Bookmarks:

1.Memastikan data TvShow tidak null.

2.Memastikan jumlah data TvShow sesuai dengan yang diharapkan.

DetailMovieActivityViewModelTest:

->Memuat Movie

1.Memastikan data movie tidak null.

2.Memastikan data movie sesuai dengan yang diharapkan.

->Memuat TvShow

1.Memastikan data tvShow tidak null.

2.Memastikan jumlah data TvShow sesuai dengan yang diharapkan.

================Pada Insturmental Testing=====================

skenario testing yang dilakukan sebagai berikut: 

1.Menampilkan data katalog Movie
2.Memastikan rv_movie dalam keadaan tampil.
3.Gulir rv_movie ke posisi data terakhir.
4.Menampilkan data detail katalog Movie
5.Memberi tindakan klik pada data pertama di rv_movie
6.Memastikan ImageView untuk image photo tampil sesuai dengan yang diharapkan.
7.Memastikan TextView untuk title tampil sesuai dengan yang diharapkan.
8.Memastikan TextView untuk year tampil sesuai dengan yang diharapkan.
9.Memastikan TextView untuk genre tampil sesuai dengan yang diharapkan.
10.Memastikan TextView untuk durasi tampil sesuai dengan yang diharapkan.
11.Memastikan TextView untuk score tampil sesuai dengan yang diharapkan.
12.Memastikan TextView untuk deskripsi tampil sesuai dengan yang diharapkan.

1.Klik TabLayout dengan teks TvShow
2.Menampilkan data katalog tvShow
3.Memastikan rv_tvShow dalam keadaan tampil.
4.Gulir tvShow ke posisi data terakhir.
5.Menampilkan data detail katalog tvShow
6.Memberi tindakan klik pada data pertama di rv_tvShow
7.Memastikan ImageView untuk image photo tampil sesuai dengan yang diharapkan.
8.Memastikan TextView untuk title tampil sesuai dengan yang diharapkan.
9.Memastikan TextView untuk year tampil sesuai dengan yang diharapkan.
10.Memastikan TextView untuk genre tampil sesuai dengan yang diharapkan.
11.Memastikan TextView untuk durasi tampil sesuai dengan yang diharapkan.
12.Memastikan TextView untuk score tampil sesuai dengan yang diharapkan.
13.Memastikan TextView untuk deskripsi tampil sesuai dengan yang diharapkan.
