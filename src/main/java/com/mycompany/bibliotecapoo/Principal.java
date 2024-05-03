package com.mycompany.bibliotecapoo;

import java.util.Scanner;

public class Principal {
/**
     * Complejidad temporal: O(1) Tiempo constante
     */
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        
        while(true) {
            System.out.println("----- Menú -----");
            System.out.println("1. Ingresar un nuevo libro");
            System.out.println("2. Mostrar todos los libros");
            System.out.println("3. Buscar un libro");
            System.out.println("4. Marcar un libro como no leído");
            System.out.println("5. Mostrar libros no leídos");
            System.out.println("6. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresar el titulo del libro");
                    String tituloUsuario=scanner.nextLine();
                    
                    System.out.println("Ingresar el autor del libro");
                    String autorUsuario=scanner.nextLine();
                    
                    System.out.println("Ingresar el año de publicación del libro");
                    int anioUsuario=scanner.nextInt();
                    
                    System.out.println("Ingresar el genero del libro");
                    String generoUsuario=scanner.nextLine();
                    
                    Libro libroRegistrado= new Libro(tituloUsuario, autorUsuario, anioUsuario,generoUsuario);
                    
                    Biblioteca reLibro = new Biblioteca();
                    reLibro.registrarLibro(libroRegistrado);

                    break;
                    
                case 2:
                    System.out.println("Libros disponibles");
                    Biblioteca mosLibros= new Biblioteca();
                    mosLibros.mostrarLibros();
                    
                    break;
                case 3:
                    System.out.println("escriba el libro, o el , o el  autor, o el genero a buscar");
                    String palabraBuscada=scanner.nextLine();
                    
                    Biblioteca busLibro= new Biblioteca();
                    busLibro.buscarLibro(palabraBuscada);

                    break;
                case 4:
                    System.out.println("Escriba el libro para marcarlo como leído");
                    Libro libroLeido = new Libro();
                    libroLeido.marcarLeido();
                    
                    break;
                case 5:
                    System.out.println("Libros no leídos");
                    
                    Biblioteca libNoLeidos=new Biblioteca();
                    libNoLeidos.mostrarLibrosNoLeidos();
                    
                    System.exit(0);

                    default;
                    System.out.println("Escriba el libro para marcarlo como leído");   
            }
        } 

    }
}
