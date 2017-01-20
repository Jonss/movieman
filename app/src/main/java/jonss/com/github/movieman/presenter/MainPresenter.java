package jonss.com.github.movieman.presenter;

import jonss.com.github.movieman.business.model.MoviePosters;
import retrofit2.Call;

/**
 * Created by joao on 19/01/17.
 */

public interface MainPresenter {

    Call<MoviePosters> getFistPageMovies();

}
