package jonss.com.github.movieman.di;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by joao on 19/01/17.
 */

@Module
public class ApplicationModule {

    @Provides
    public Retrofit providesRetrofit() {
        return new Retrofit.Builder().baseUrl("").build();
    }

}
