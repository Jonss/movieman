package jonss.com.github.movieman;

import android.app.Application;

import jonss.com.github.movieman.di.DaggerMovieComponent;

/**
 * Created by joao on 19/01/17.
 */

public class MovieManApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerMovieComponent.builder().build();
    }
}
