package jonss.com.github.movieman.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import jonss.com.github.movieman.R;
import jonss.com.github.movieman.StringUtils;
import jonss.com.github.movieman.business.model.MoviePosters;
import jonss.com.github.movieman.presenter.MainPresenter;
import jonss.com.github.movieman.presenter.MainPresenterImpl;
import jonss.com.github.movieman.view.adapter.MoviePosterAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    RecyclerView popularMoviesList;

    @Inject
    MainPresenterImpl presenter;

    @Inject
    MoviePosterAdapter adapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        popularMoviesList = (RecyclerView) view.findViewById(R.id.popular_movies_list);
        popularMoviesList.setAdapter(adapter);

        Call<MoviePosters> fistPageMovies = presenter.getFistPageMovies();
        fistPageMovies.enqueue(new Callback<MoviePosters>() {
            @Override
            public void onResponse(Call<MoviePosters> call, Response<MoviePosters> response) {
                updateList(response.body().getPopularMovies());
            }

            @Override
            public void onFailure(Call<MoviePosters> call, Throwable t) {
                Log.wtf("Deu ruim[]", String.valueOf(call.request().body()));
            }
        });

        return view;
    }

    private void updateList(List<MoviePosters.Poster> popularMovies) {
        adapter.addPosters(popularMovies);
        popularMoviesList.getAdapter().notifyDataSetChanged();
    }
}
