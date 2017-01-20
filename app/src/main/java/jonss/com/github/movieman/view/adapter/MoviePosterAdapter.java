package jonss.com.github.movieman.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import jonss.com.github.movieman.R;
import jonss.com.github.movieman.business.model.MoviePosters;

/**
 * Created by joao on 20/01/17.
 */

public class MoviePosterAdapter extends RecyclerView.Adapter<MoviePosterViewHolder>{

    private final LayoutInflater inflater;
    private List<MoviePosters.Poster> moviesPoster;
    private Context context;

    public MoviePosterAdapter(Context context) {
        this.moviesPoster = new ArrayList<>();
        inflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public MoviePosterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.movie_poster, parent);

        return null;
    }

    @Override
    public void onBindViewHolder(MoviePosterViewHolder holder, int position) {
        MoviePosters.Poster poster = moviesPoster.get(position);
        holder.setImage(poster.getPosterUrl(), context);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public void addPosters(List<MoviePosters.Poster> moviesPoster) {
        this.moviesPoster = moviesPoster;
    }
}
