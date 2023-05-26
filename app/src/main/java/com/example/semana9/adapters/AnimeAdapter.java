package com.example.semana9.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.semana9.Anime;
import com.example.semana9.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AnimeAdapter extends RecyclerView.Adapter {

    private List<Anime> items;

    public AnimeAdapter(List<Anime> items) {
        this.items = items;
    }

    public List<Anime> getItems() {
        return items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_string, parent, false);
        PersonaViewHolder viewHolder = new PersonaViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Anime item = items.get(position);
        View view = holder.itemView;

        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvDescripcion = view.findViewById(R.id.tvDescripcion);
        ImageView imageView = view.findViewById(R.id.imageView);
        ImageView imageStar = view.findViewById(R.id.imageStar);
        //ImageButton btnLlamar = view.findViewById(R.id.btnLlamar);
        //ImageButton btnMensaje = view.findViewById(R.id.btnMensaje);

        tvName.setText(item.getNombre());
        tvDescripcion.setText(item.getDescripcion());
        //tvCelular.setText(String.valueOf(item.getNumero()));

        //imageView.setImageResource(item.getImagenes());

        Picasso.get().load(item.getImagenes()).into(imageView);

        imageStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (item.isEsFavorito()) {
                    imageStar.setImageResource(R.drawable.starwhite);
                    item.setEsFavorito(false); // Actualizar el estado del favorito
                } else {
                    imageStar.setImageResource(R.drawable.star);
                    item.setEsFavorito(true); // Actualizar el estado del favorito
                }
            }
        });
        //Picasso.get().load("https://i.imgur.com/DvpvklR.png").into(imageView);

        /*
        btnLlamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = String.valueOf(item.getNumero());
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + phoneNumber));
                v.getContext().startActivity(intent);
            }
        });

        btnMensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = String.valueOf(item.getNumero());
                String initialMessage = "¡Hola!";

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("smsto:" + phoneNumber));
                intent.putExtra("sms_body", initialMessage);

                v.getContext().startActivity(intent);
            }
        });
        */
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    public class PersonaViewHolder extends RecyclerView.ViewHolder {

        public PersonaViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
