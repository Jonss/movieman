package jonss.com.github.movieman.di;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

import static jonss.com.github.movieman.Constants.MOVIEDB_URL;

/**
 * Created by joao on 19/01/17.
 */

@Module
public class ApplicationModule {

    @Provides
    @Named("movieDbUrl")
    public Retrofit providesRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(MOVIEDB_URL)
                .build();
    }

}
