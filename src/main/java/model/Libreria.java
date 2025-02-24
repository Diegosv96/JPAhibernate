package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "librerias")
public class Libreria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nombre;
    @Column
    private String dueño;
    @Column
    private String direccion;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "librerias_libros", joinColumns = @JoinColumn(name = "libreriaId"),inverseJoinColumns = @JoinColumn(name = "libroId"))
    private List<Libro> libros;

    public Libreria(String nombre, String dueño, String direccion){
        this.nombre = nombre;
        this.dueño = dueño;
        this.direccion = direccion;
    }

    /*@Override
    public String toString() {
        return "Libreria{" +
                "id=" + id +
                ", nombre=" + nombre +
                ", dueño=" + dueño +
                ", direccion=" + direccion +
                '}';
    }*/
}
