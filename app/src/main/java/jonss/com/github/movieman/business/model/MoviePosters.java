package jonss.com.github.movieman.business.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import jonss.com.github.movieman.Constants;

/**
 * Created by joao on 20/01/17.
 */

public class MoviePosters {

    @SerializedName("results")
    private List<Poster> posters;

    public List<Poster> getPopularMovies() {
        return posters;
    }

    public class Poster {

        @SerializedName("poster_path")
        private String posterPath;

        public String getPosterUrl() {
            return Constants.MOVIEDB_IMAGE_URL + this.posterPath;
        }
    }
}
