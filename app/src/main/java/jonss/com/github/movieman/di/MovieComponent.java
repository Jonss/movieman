package jonss.com.github.movieman.di;

import dagger.Component;
import jonss.com.github.movieman.presenter.MainPresenterImpl;
import jonss.com.github.movieman.view.MainActivity;
import jonss.com.github.movieman.view.MainActivityFragment;

/**
 * Created by joao on 19/01/17.
 */

@Component(modules = {
        ApplicationModule.class,
        MovieModule.class
})
public interface MovieComponent {

    void inject(MainActivity activity);
    void inject(MainActivityFragment activityFragment);
    void inject(MainPresenterImpl presenter);

}
