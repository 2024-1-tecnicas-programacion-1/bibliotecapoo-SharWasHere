package com.mycompany.bibliotecapoo;

import java.util.LinkedList;

public class Biblioteca {

    private LinkedList<Libro> libros;
/**
     * Complejidad temporal: O(1) Tiempo constante
     */
    public Biblioteca() {
        this.libros = new LinkedList<>();
    }
/**
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void registrarLibro(Libro libroNuevo) {
        libros.add(libroNuevo);
    }
/**
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void buscarLibro(String palabraBusqueda) {
        for (int i = 0; i < libros.size(); i++) {
            Libro libroVisitado = libros.get(i);

            if (libroVisitado.getTitulo().equals(palabraBusqueda) || libroVisitado.getAutor().equals(palabraBusqueda) || libroVisitado.getGenero().equals(palabraBusqueda)) {
                System.out.println(libroVisitado.mostrarInformacion());

            }
        }
    }
/**
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void mostrarLibros() {
        for (int i = 0; i < libros.size(); i++) {
            System.out.println(i);
        }
    }
/**
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void mostrarLibrosNoLeidos() {

       for(int i=0;i < libros.size();i++){
           if(libros.get(i).isLeido()==false){
               System.out.println(libros.get(i));
           }
       }
    }
}

