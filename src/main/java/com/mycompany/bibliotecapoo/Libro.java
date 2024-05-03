package com.mycompany.bibliotecapoo;

public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String genero;
    private boolean leido;

    public Libro(String titulo, String autor, int anioPublicacion, String genero) {

        /**
     * Complejidad temporal: O(1) Tiempo constante
     */
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.genero = genero;
        this.leido = false;

    }
    public Libro(){
        
    }
/**
     * Complejidad temporal: O(1) Tiempo constante
     */
    public String mostrarInformacion() {
        String mostrar = titulo + " " + autor + " " + anioPublicacion + " " + genero;
        return mostrar;

    }
/**
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void marcarLeido() {
        leido = true;
    }
/**
     * Complejidad temporal: O(1) Tiempo constante
     */
    public boolean esAntiguo() {
        int diferencia = 2024 - anioPublicacion;

        if (diferencia > 50) {
            return true;
        } else {
            return false;
        }
    }
/**
     * Complejidad temporal: O(1) Tiempo constante
     */
    public String getTitulo() {
        return titulo;
    }
/**
     * Complejidad temporal: O(1) Tiempo constante
     */
    public String getAutor() {
        return autor;
    }
/**
     * Complejidad temporal: O(1) Tiempo constante
     */
    public String getGenero() {
        return genero;
    }
    /**
     * Complejidad temporal: O(1) Tiempo constante
     */
   public boolean isLeido() {
        return leido;
    }
}
