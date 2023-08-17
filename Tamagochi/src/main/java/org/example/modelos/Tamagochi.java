package org.example.modelos;

public class Tamagochi {
    private String nombre;
    private Estado estado;
    private int nivel;

    private Tamagochi() {
    }

    public Tamagochi(String nombre) {
        this.nombre = nombre;

        this.estado = Estado.CONTENTO;
        this.nivel = 0;


    }

    public void comer() {

    }

    public void jugar() {

    }

    @Override
    public String toString() {
        return "Tamagochi{" +
                "nombre='" + nombre + '\'' +
                ", estado=" + estado +
                ", nivel=" + nivel +
                '}';
    }
}
