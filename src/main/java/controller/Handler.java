package controller;

import dao.AutorDao;
import dao.EditorialDao;
import dao.LibreriaDao;
import dao.LibroDao;
import model.Autor;
import model.Editorial;
import model.Libreria;
import model.Libro;

public class Handler {
    private AutorDao autordao;
    private EditorialDao editorialdao;
    private LibreriaDao libreriadao;
    private LibroDao librodao;

    public Handler() {
        autordao = new AutorDao();
        editorialdao = new EditorialDao();
        libreriadao = new LibreriaDao();
        librodao = new LibroDao();
    }

    public void agregarAutor(Autor autor) {
        autordao.insertAutor(autor);
    }

    public void agregarEditorial(Editorial editorial) {
        editorialdao.insertEditorial(editorial);
    }

    public void agregarLibreria(Libreria libreria) {
        libreriadao.insertLibreria(libreria);
    }

    public void agregarLibro(Libro libro, int autorId, int editorialId) {
        librodao.insertLibro(libro,autorId,editorialId);
    }
    public void agregarLibroLibreria(int libroId, int libreriaId){
        libreriadao.updateLibreriaLibro(libroId,libreriaId);
    }
    public void mostrarLibros(){
        for(Libro lib : librodao.getAllLibros()){
            System.out.println(lib);
        }
    }
    public void mostrarAutores(){
        for(Autor aut : autordao.getAllAutores()){
            System.out.println(aut);
        }
    }
    public void mostrarLibrerias(){
        for(Libreria lib : libreriadao.getAllLibrerias()){
            System.out.println(lib);
        }
    }
    public void mostrarLibrosLibrerias(){
        for(Libro lib : librodao.getAllLibros()){
            String libroSTR = lib.toString() + "Librerias=[";
            for(Libreria libre : lib.getLibrerias()){
                libroSTR += "Libreria{" +
                        "id=" + libre.getId() +
                        ", nombre=" + libre.getNombre() +
                        ", dueño=" + libre.getDueño() +
                        ", direccion=" + libre.getDireccion() +
                        '}';
            }
            libroSTR += "]";
            System.out.println(libroSTR);
        }
    }
}
