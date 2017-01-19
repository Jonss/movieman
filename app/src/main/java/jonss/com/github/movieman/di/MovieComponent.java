package jonss.com.github.movieman.di;

import dagger.Component;
import jonss.com.github.movieman.view.MainActivity;
import jonss.com.github.movieman.view.MainActivityFragment;

/**
 * Created by joao on 19/01/17.
 */

@Component(modules = {MovieModule.class,
        ApplicationModule.class})
public interface MovieComponent {

    void inject(MainActivity mainActivity);
    void inject(MainActivityFragment mainActivityFragment);

}
