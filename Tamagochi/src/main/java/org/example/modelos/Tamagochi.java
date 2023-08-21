package org.example.modelos;

public class Tamagochi {
    private String nombre;
    private Estado estado;
    private int nivel;

    private int tiempoMinAburrido;

    private Tamagochi() {
    }

    public Tamagochi(String nombre) {
        this.nombre = nombre;

        this.estado = Estado.CONTENTO;
        this.nivel = 0;
        this.tiempoMinAburrido=0;


    }

    public void comer() {

        if (this.estado==Estado.CONTENTO) // Ojo que cambio de estado y sube de nivel
            this.nivel++;

        if (this.estado==Estado.HAMBRE)
            this.estado=Estado.CONTENTO;

        if (this.estado==Estado.ABURRIDO){
            if (this.tiempoMinAburrido>80)
                this.estado=Estado.CONTENTO;
        }
    }

    public void jugar() {

        if (this.estado==Estado.CONTENTO)
            this.nivel+=2;

        if (this.estado==Estado.ABURRIDO)
            this.estado=Estado.CONTENTO;

        if (this.estado==Estado.HAMBRE)
            System.out.println("No puedo jugar, estoy hambirento");

    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estado getEstado() {
        return estado;
    }

    private void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getNivel() {
        return nivel;
    }

    private void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getTiempoMinAburrido() {
        return tiempoMinAburrido;
    }

    private void setTiempoMinAburrido(int tiempoMinAburrido) {
        this.tiempoMinAburrido = tiempoMinAburrido;
    }

    public void sumar40MinAburrido(){
        if(this.estado==Estado.ABURRIDO)
            tiempoMinAburrido+=40;
    }


    @Override
    public String toString() {
        return  "nombre='" + nombre +"\n" +
                ", estado=" + estado +"\n"+
                ", nivel=" + nivel +"\n"+
                ", tiempo aburrido (min)=" + tiempoMinAburrido +"\n\n"
                ;
    }
}
