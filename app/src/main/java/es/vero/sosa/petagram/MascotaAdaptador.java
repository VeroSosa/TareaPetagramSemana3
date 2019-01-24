package es.vero.sosa.petagram;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by ELVIN on 12/06/2016.
 */
public class MascotaAdaptador extends RecyclerView.Adapter<mascotaViewHolder>{

    private ArrayList<Mascota> item;

    public MascotaAdaptador(ArrayList<Mascota> item){
        this.item = item;
    }


    @Override
    public mascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent,false);
        mascotaViewHolder mascota = new mascotaViewHolder(v);
        return mascota;
    }

    @Override
    public void onBindViewHolder(mascotaViewHolder mascotaHolder, int position) {
        mascotaHolder.nombre.setText(this.item.get(position).getNombre());
        mascotaHolder.foto.setImageResource(this.item.get(position).getFoto());
        mascotaHolder.foto.setBackgroundColor(this.item.get(position).getColor());
    }

    @Override
    public int getItemCount() {
        return this.item.size();
    }
}
