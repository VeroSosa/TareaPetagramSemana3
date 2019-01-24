package es.vero.sosa.petagram;

/**
 * Created by ELVIN on 28/05/2016.
 */
public class Mascota {

    private int foto;
    private String nombre;
    private int color;

    public Mascota(int foto, String nombre, int color){
        this.foto = foto;
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
