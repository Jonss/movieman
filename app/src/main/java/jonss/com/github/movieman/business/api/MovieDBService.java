package jonss.com.github.movieman.business.api;

import android.graphics.Movie;

import java.util.List;

import jonss.com.github.movieman.business.model.MoviePosters;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by joao on 19/01/17.
 */

public interface MovieDBService {

    @GET("/popular")
    MoviePosters getPopularMovies(@Query("api_key") String apiKey,
                                 @Query("language") String language,
                                 @Query("page") Integer page);

    @GET("/popular")
    Call<MoviePosters> getFirstPagePopularMovies(String moviedbApiKey, String language);
}
