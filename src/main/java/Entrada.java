import controller.Handler;
import model.Autor;
import model.Editorial;
import model.Libreria;
import model.Libro;

import java.util.Date;

public class Entrada {
    private static Handler handler;

    public static void main(String[] args) {
        handler = new Handler();
        // cargarDatos();
        handler.mostrarLibros();
        handler.mostrarAutores();
        handler.mostrarLibrerias();
        handler.mostrarLibrosLibrerias();
    }

    private static void cargarDatos() {
        Autor autor1 = new Autor("Gabriel", "García Márquez", new Date(1927-1900, 2, 6));
        Autor autor2 = new Autor("Miguel", "de Cervantes", new Date(1547-1900, 8, 29));
        Autor autor3 = new Autor("Julio", "Verne", new Date(1828-1900, 1, 8));

        handler.agregarAutor(autor1);
        handler.agregarAutor(autor2);
        handler.agregarAutor(autor3);

        Editorial editorial1 = new Editorial("Editorial Sudamericana", "Buenos Aires");
        Editorial editorial2 = new Editorial("Editorial Planeta", "Madrid");

        handler.agregarEditorial(editorial1);
        handler.agregarEditorial(editorial2);

        Libro libro1 = new Libro("Cien Años de Soledad", 39.99);
        Libro libro2 = new Libro("El Coronel no tiene quien le escriba", 29.99);
        Libro libro3 = new Libro("Don Quijote de la Mancha", 34.99);
        Libro libro4 = new Libro("Novelas Ejemplares", 24.99);
        Libro libro5 = new Libro("Viaje al Centro de la Tierra", 19.99);
        Libro libro6 = new Libro("La Vuelta al Mundo en 80 días", 22.99);
        Libro libro7 = new Libro("De la Tierra a la Luna", 27.99);
        Libro libro8 = new Libro("El Barón Rampante", 31.99);

        handler.agregarLibro(libro1, 1, 1);
        handler.agregarLibro(libro2, 1, 1);
        handler.agregarLibro(libro3, 2, 2);
        handler.agregarLibro(libro4, 2, 2);
        handler.agregarLibro(libro5, 3, 1);
        handler.agregarLibro(libro6, 3, 2);
        handler.agregarLibro(libro7, 3, 1);
        handler.agregarLibro(libro8, 1, 2);

        Libreria libreria1 = new Libreria("Librería Central", "Juan Pérez", "Calle Principal 123");
        Libreria libreria2 = new Libreria("Librería Nacional", "Pedro Gómez", "Avenida Independencia 456");

        handler.agregarLibreria(libreria1);
        handler.agregarLibreria(libreria2);

        handler.agregarLibroLibreria(1,1);
        handler.agregarLibroLibreria(2,1);
        handler.agregarLibroLibreria(3,1);
        handler.agregarLibroLibreria(4,1);
        handler.agregarLibroLibreria(5,2);
        handler.agregarLibroLibreria(6,2);
        handler.agregarLibroLibreria(7,2);
        handler.agregarLibroLibreria(8,2);

        System.out.println("Datos de prueba insertados");
    }
}
