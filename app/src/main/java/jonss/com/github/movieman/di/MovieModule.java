package jonss.com.github.movieman.di;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import jonss.com.github.movieman.presenter.MainPresenterImpl;
import jonss.com.github.movieman.view.MainActivity;
import jonss.com.github.movieman.view.adapter.MoviePosterAdapter;

/**
 * Created by joao on 19/01/17.
 */

@Module
public class MovieModule {

    @Provides

    public MainPresenterImpl providesMainPresenter() {
        return new MainPresenterImpl();
    }

    @Provides
    public Context providesMainActivityContext() {
        return new MainActivity().getBaseContext();
    }

    @Provides
    public MoviePosterAdapter providesMoviePosterAdapter(Context context) {
        return new MoviePosterAdapter(context);
    }
}
