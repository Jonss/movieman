package jonss.com.github.movieman.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import jonss.com.github.movieman.R;

/**
 * Created by joao on 20/01/17.
 */
public class MoviePosterViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;

    public MoviePosterViewHolder(View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.movie_poster_item);
    }

    public void setImage(String posterUrl, Context context) {
        Glide.with(context).load(posterUrl).into(imageView);
    }
}
