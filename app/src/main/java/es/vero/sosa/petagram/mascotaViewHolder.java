package es.vero.sosa.petagram;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ELVIN on 12/06/2016.
 */
public class mascotaViewHolder extends RecyclerView.ViewHolder {

    TextView nombre;
    ImageView foto;

    public mascotaViewHolder(View itemView) {
        super(itemView);
        nombre = (TextView) itemView.findViewById(R.id.TextView_Nombre);
        foto = (ImageView) itemView.findViewById(R.id.ImageViewMascota);
    }
}
