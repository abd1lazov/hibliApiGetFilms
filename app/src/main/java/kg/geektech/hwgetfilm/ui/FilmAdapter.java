package kg.geektech.hwgetfilm.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import kg.geektech.hwgetfilm.R;

public class FilmAdapter extends RecyclerView.Adapter<FilmAdapter.ViewHolder> {

    List<Films> list = new ArrayList<>();
    private Callback callback;

    public FilmAdapter(Callback callback) {
        this.callback = callback;
    }

    public FilmAdapter(){

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_filmlist, parent, false);

        return new ViewHolder(view,callback);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void addItems(List<Films>list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private TextView producer;
        private Callback callback;

        public ViewHolder(@NonNull View itemView,Callback callback) {
            super(itemView);
            this.callback = callback;
            title = itemView.findViewById(R.id.text_title_film);
            producer = itemView.findViewById(R.id.text_director_film);
        }

        public void onBind(Films films) {
            title.setText(films.getTitle());
            producer.setText(films.getTitle());
            title.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    callback.filmClick(films);
                }
            });
        }
    }

    public interface Callback {
        void filmClick(Films films);
    }
}

