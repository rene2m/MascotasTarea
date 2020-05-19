package com.sotcode.mascotastarea.pojo;

public class Mascotas {


    private String nombre;
    private String raiting;
    private int foto;

    public Mascotas(String nombre, String raiting, int foto){
        this.nombre = nombre;
        this.raiting = raiting;
        this.foto = foto;
    }
    public String getNombre() {
        return nombre;
    }

    public String getRaiting() {
        return raiting;
    }

    public int getFoto() {
        return foto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaiting(String raiting) {
        this.raiting = raiting;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}