package jonss.com.github.movieman.presenter;

import javax.inject.Inject;

import jonss.com.github.movieman.Constants;
import jonss.com.github.movieman.StringUtils;
import jonss.com.github.movieman.business.api.MovieDBService;
import jonss.com.github.movieman.business.model.MoviePosters;
import retrofit2.Call;
import retrofit2.Retrofit;

/**
 * Created by joao on 19/01/17.
 */

public class MainPresenterImpl implements MainPresenter {

    @Inject
    Retrofit retrofit;

    public MainPresenterImpl() {
    }

    public Call<MoviePosters> getFistPageMovies() {
        return retrofit.create(MovieDBService.class)
                .getFirstPagePopularMovies(Constants.MOVIEDB_API_KEY, StringUtils.getLanguage());
    }
}
