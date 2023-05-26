package com.example.semana9;

public class Anime {
    private String nombre;
    private String descripcion;
    private String imagenes;
    private boolean esFavorito;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getImagenes() {
        return imagenes;
    }

    public void setImagenes(String imagenes) {
        this.imagenes = imagenes;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEsFavorito() {
        return esFavorito;
    }

    public void setEsFavorito(boolean esFavorito) {
        this.esFavorito = esFavorito;
    }

    public Anime(String nombre, String descripcion, String imagenes, Boolean esFavorito) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagenes = imagenes;
        this.esFavorito = esFavorito;

    }


}
