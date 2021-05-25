package com.puput.mymoviesubsatu.utils

import com.puput.mymoviesubsatu.R
import com.puput.mymoviesubsatu.data.MovieDataEntity

object CatalogueData {

    fun generateMovieData(): List<MovieDataEntity> {
        val movie = ArrayList<MovieDataEntity>()

        movie.add(
            MovieDataEntity(
                "1",
                "Alita: Battle Angle",
                "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                "2019",
                "Action, Science Fiction, Adventure\n",
                "2h 2m",
                "72%",
                R.drawable.poster_alita
            )
        )
        movie.add(
            MovieDataEntity(
                "2",
                "Aquaman",
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                "2018",
                "Action, Adventure, Fantasy",
                "2h 23m",
                "69%",
                R.drawable.poster_aquaman
            )
        )
        movie.add(
            MovieDataEntity(
                "3",
                "Bohemian",
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                "2018",
                "Music, Drama, History",
                "2h 15m",
                "80%",
                R.drawable.poster_bohemian
            )
        )
        movie.add(
            MovieDataEntity(
                "4",
                "Cold Persuit",
                "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                "2019",
                "Action, Crime, Thriller",
                "1h 59m",
                "57%",
                R.drawable.poster_cold_persuit
            )
        )
        movie.add(
            MovieDataEntity(
                "5",
                "Creed II",
                "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
                "2018",
                "Drama",
                "2h 10m",
                "69%",
                R.drawable.poster_creed
            )
        )
        movie.add(
            MovieDataEntity(
                "6",
                "Fantastic Beasts: The Crimes of Grindelwald",
                "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                "2018",
                "Adventure, Fantasy, Drama",
                "2h 14m",
                "69",
                R.drawable.poster_crimes
            )
        )
        movie.add(
            MovieDataEntity(
                "7",
                "Glass",
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                "2019",
                "Thriller, Drama, Science Fiction",
                "2h 9m",
                "67%",
                R.drawable.poster_glass
            )
        )
        movie.add(
            MovieDataEntity(
                "8",
                "How to Train Your Dragon: The Hidden World",
                "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
                "2019",
                "Animation, Family, Adventure",
                "1h 44m",
                "78",
                R.drawable.poster_how_to_train
            )
        )
        movie.add(
            MovieDataEntity(
                "9",
                "Avengers: Infinity War",
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                "2018",
                "Adventure, Action, Science Fiction",
                "2h 29m",
                "83%",
                R.drawable.poster_infinity_war
            )
        )
        movie.add(
            MovieDataEntity(
                "10",
                "Mortal Engines",
                "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
                "2018",
                "Adventure, Science Fiction",
                "2h 10m",
                "61%",
                R.drawable.poster_mortal_engines
            )
        )
        return movie
    }

    fun generateTvShow(): List<MovieDataEntity> {
        val tvShow = ArrayList<MovieDataEntity>()

        tvShow.add(
            MovieDataEntity(
                "11",
                "Arrow",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "2012",
                "Crime, Drama, Mystery, Action & Adventure",
                "42m",
                "66%",
                R.drawable.poster_arrow
            )
        )
        tvShow.add(
            MovieDataEntity(
                "12",
                "Doom Patrol ",
                "The members of the Doom Patrol now find themselves mini-sized and stranded on Cliff’s toy race car track. Here they begin to deal with their feelings of betrayal by Niles Caulder aka The Chief, while confronting their own personal baggage. And as each member faces the challenge of growing beyond their own past traumatic experiences, they must come together to embrace and protect the newest member of the family: Dorothy Spinner, Niles’ daughter, whose powers remain a mysterious but real threat to bringing on the end of the world.",
                "2019",
                "Sci-Fi & Fantasy, Comedy, Drama",
                "49m",
                "76%",
                R.drawable.poster_doom_patrol

            )
        )
        tvShow.add(
            MovieDataEntity(
                "13",
                "The Flash",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "2014",
                "CDrama, Sci-Fi & Fantasy",
                "44m",
                "77%",
                R.drawable.poster_flash
            )
        )
        tvShow.add(
            MovieDataEntity(
                "14",
                "Grey Antomy",
                "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                "2005",
                "Drama",
                "43m",
                "82%",
                R.drawable.poster_grey_anatomy
            )
        )
        tvShow.add(
            MovieDataEntity(
                "15",
                "Hanna",
                "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film.",
                "2019",
                "Action & Adventure, Drama",
                "50m",
                "75%",
                R.drawable.poster_hanna
            )
        )
        tvShow.add(
            MovieDataEntity(
                "16",
                "Marvel's Iron Fist",
                "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.",
                "2017",
                "Action & Adventure, Drama, Sci-Fi & Fantasy",
                "55m",
                "66%",
                R.drawable.poster_iron_fist
            )
        )
        tvShow.add(
            MovieDataEntity(
                "17",
                "NCIS",
                "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
                "2003",
                "Crime, Action & Adventure, Drama\n",
                "45m",
                "74%",
                R.drawable.poster_ncis
            )
        )
        tvShow.add(
            MovieDataEntity(
                "18",
                "Riverdale",
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                "2017",
                "Mystery, Drama, Crime",
                "45m",
                "86%",
                R.drawable.poster_riverdale
            )
        )
        tvShow.add(
            MovieDataEntity(
                "19",
                "SuperGirl",
                "Twenty-four-year-old Kara Zor-El, who was taken in by the Danvers family when she was 13 after being sent away from Krypton, must learn to embrace her powers after previously hiding them. The Danvers teach her to be careful with her powers, until she has to reveal them during an unexpected disaster, setting her on her journey of heroism.",
                "2015",
                "Drama, Sci-Fi & Fantasy, Action & Adventure",
                "42m",
                "72%",
                R.drawable.poster_supergirl
            )
        )
        tvShow.add(
            MovieDataEntity(
                "20",
                "Super Natural",
                "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                "2005",
                "Drama, Mystery, Sci-Fi & Fantasy",
                "45m",
                "82%",
                R.drawable.poster_supernatural
            )
        )

        return tvShow
    }

}