package com.example.semana9;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.semana9.adapters.AnimeAdapter;

import java.util.ArrayList;
import java.util.List;
public class ListaAnimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_anime);

       AnimeAdapter adapter = new AnimeAdapter(data());

        RecyclerView rvLista =  findViewById(R.id.rvListaSimple);
        rvLista.setLayoutManager(new LinearLayoutManager(this));
        rvLista.setAdapter(adapter);

        /*
        EditText etNombre = findViewById(R.id.etNombre);
        Button btnAgregarContacto = findViewById(R.id.btnAgregarContacto);

        btnAgregarContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = etNombre.getText().toString();
                int numero = Integer.parseInt(etNumero.getText().toString());

                // Crear un nuevo objeto Persona con los datos ingresados
                Anime nuevoContacto = new Anime(nombre, numero, R.drawable.silueta2);

                // Obtener la lista actual de personas del adaptador
                List<Anime> anime = adapter.getItems();

                // Agregar el nuevo contacto a la lista de personas
                anime.add(nuevoContacto);

                // Notificar al adaptador que se ha insertado un nuevo elemento
                adapter.notifyItemInserted(anime.size() - 1);

                // Limpiar los EditText
                etNombre.setText("");
                etNumero.setText("");
            }
        });

         */
    }

    private List<Anime> data() {
        String desc = "One Piece narra la historia de un joven llamado Monkey D. Luffy, que inspirado por su amigo pirata Shanks, comienza un viaje para alcanzar su sueño, ser el Rey de los piratas, para lo cual deberá encontrar el tesoro One Piece dejado por el anterior rey de los piratas Gol D. Roger.";
        String desc2 = "Las criaturas pokémon son monstruos que se encuentran en el mundo Pokémon (mezcla entre la Tierra y una versión caricaturizada de ella) que deben ser capturadas por los entrenadores para potenciar sus poderes y características.";
        String desc3 = "Attack on Titan (進撃の巨人 Shingeki no Kyojin) es un manga serializado escrito e ilustrado por Hajime Isayama. Cuenta la historia de la humanidad en una época con estética germana del siglo 19, luchando por sobrevivir durante los ataques de unos seres humanoides gigantes llamados titanes.";
        String desc4 = "La historia de la obra se da lugar en un mundo futurista en el que una organización paramilitar llamada NERV protege a la humanidad de los ataques de seres de origen y naturaleza desconocidos, los «Ángeles», utilizando para ello bio mechas humanoides llamados Evangelion (acortado a EVA).";
        String desc5 = "Berserk nos cuenta la historia de Guts , un antihéroe mercenario que vaga por el mundo en solitario en búsqueda de Apóstoles , unos seres demoníacos que antaño fueron humanos pero que sacrificaron una parte importante de sus vidas para conseguir poderes que les permitieran alcanzar sus más oscuros deseos.";
        List<Anime> anime = new ArrayList<>();
        anime.add(new Anime("One Piece",desc,"https://i.ebayimg.com/images/g/ACIAAOSwdnphKthz/s-l500.png" , false));
        anime.add(new Anime("Pokémon",desc2,"https://myfamilycinema.com/wp-content/uploads/2022/06/MFC-Kawaii2.jpg" , false));
        anime.add(new Anime("Ataque a los Titanes",desc3,"https://i.ebayimg.com/images/g/VVEAAOSwtY9jxxpB/s-l500.png" , true));
        anime.add(new Anime("Neon Genesis Evangelion",desc4,"https://i.ebayimg.com/images/g/5OAAAOSwIQ9hZM10/s-l500.png" , false));
        anime.add(new Anime("Berserk",desc5,"https://i.ebayimg.com/images/g/vQ0AAOSwhMBhZMqL/s-l500.png" , true));
        return anime;
    }
}