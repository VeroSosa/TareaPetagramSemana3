package es.vero.sosa.petagram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class FavoritosActivity extends AppCompatActivity {

    private RecyclerView recicladorFav;
    private RecyclerView.LayoutManager layoutManagerFav;
    private RecyclerView.Adapter recyclerAdapterFav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Favoritos");

        ArrayList<Mascota> datosFav = new ArrayList<Mascota>();

        datosFav.add(new Mascota(R.drawable.perro3, "Monny",     0xFF45694C));
        datosFav.add(new Mascota(R.drawable.perro6, "Keysi",      0xFF45694C));
        datosFav.add(new Mascota(R.drawable.perro5, "Bolo",      0xFF45694C));
        datosFav.add(new Mascota(R.drawable.perro1, "Coqueta",  0xFF45694C));
        datosFav.add(new Mascota(R.drawable.perro4, "Junior",  0xFF45694C));

        recicladorFav = (RecyclerView) findViewById(R.id.ReciclerView_RecicladorFavorito);
        layoutManagerFav = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recicladorFav.setLayoutManager(layoutManagerFav);

        recyclerAdapterFav = new MascotaAdaptador(datosFav);
        recicladorFav.setAdapter(recyclerAdapterFav);

    }
}
